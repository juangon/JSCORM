<#if dbType=="mysql">
SET FOREIGN_KEY_CHECKS = 0;
</#if>
DROP TABLE IF EXISTS QuizCategory CASCADE;
<#if dbType=="mysql">
SET FOREIGN_KEY_CHECKS = 1;
</#if>

CREATE TABLE QuizCategory
(
  <#if dbType=="postgres">
  id serial,
  <#elseif dbType=="mysql" >
  id integer not null auto_increment unique,
  <#else>
  id int auto_increment,
  </#if>
  title text,
  description text,
  parentID integer,
  quizID integer,
  arrangementIndex integer,
  CONSTRAINT QuizCategory_pk PRIMARY KEY (id)
<#if dbType=="postgres">
) WITH (
  OIDS=FALSE
</#if>
)<#if dbType=="mysql" >
   ENGINE=InnoDB
</#if>;

ALTER TABLE QuizCategory ADD CONSTRAINT QuizCategory_fk1 FOREIGN KEY (parentID) REFERENCES QuizCategory(id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE QuizCategory ADD CONSTRAINT QuizCategory_fk2 FOREIGN KEY (quizID) REFERENCES Quiz(id) ON DELETE CASCADE ON UPDATE CASCADE;