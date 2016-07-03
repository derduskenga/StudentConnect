# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table admin_user (
  admin_user_id             bigint not null,
  admin_user_first_name     varchar(255),
  admin_user_last_name      varchar(255),
  admin_user_email          varchar(255),
  admin_user_password       varchar(255),
  admin_user_salt           varchar(255),
  is_admin_user_active      boolean default 'true',
  constraint uq_admin_user_admin_user_email unique (admin_user_email),
  constraint pk_admin_user primary key (admin_user_id))
;

create table campus (
  campus_id                 bigint not null,
  campus_name               varchar(255),
  campus_description        varchar(255),
  institution_institution_id bigint,
  constraint pk_campus primary key (campus_id))
;

create table club_society (
  club_society_id           bigint not null,
  club_society_name         varchar(255),
  club_society_description  TEXT,
  institution_institution_id bigint,
  constraint pk_club_society primary key (club_society_id))
;

create table county (
  county_id                 bigint not null,
  county_name               varchar(255),
  constraint pk_county primary key (county_id))
;

create table course (
  course_id                 bigint not null,
  course_name               varchar(255),
  course_description        TEXT,
  course_blog_url           varchar(255),
  course_level_course_level_id bigint,
  course_field_course_field_id bigint,
  constraint pk_course primary key (course_id))
;

create table course_certification (
  course_certification_id   bigint not null,
  certification_course_course_id bigint,
  constraint pk_course_certification primary key (course_certification_id))
;

create table course_field (
  course_field_id           bigint not null,
  course_field_name         varchar(255),
  course_field_description  TEXT,
  constraint pk_course_field primary key (course_field_id))
;

create table course_institution_mode_of_study (
  course_institution_mode_of_study_id bigint not null,
  mode_of_study             integer,
  institution_course_fees   float,
  institution_course_fees_url varchar(255),
  institution_course_institution_course_id bigint,
  constraint ck_course_institution_mode_of_study_mode_of_study check (mode_of_study in (0,1,2,3,4,5)),
  constraint pk_course_institution_mode_of_st primary key (course_institution_mode_of_study_id))
;

create table course_level (
  course_level_id           bigint not null,
  course_level_name         varchar(255),
  course_level_description  TEXT,
  constraint pk_course_level primary key (course_level_id))
;

create table course_specialization (
  course_specialization_id  bigint not null,
  specialization_specialization_id bigint,
  course_course_id          bigint,
  constraint pk_course_specialization primary key (course_specialization_id))
;

create table examination_body (
  examination_body_id       bigint not null,
  examination_body_name     varchar(255),
  examination_body_description TEXT,
  examination_body_website_url varchar(255),
  institution_course_institution_course_id bigint,
  constraint pk_examination_body primary key (examination_body_id))
;

create table excel_sample_file (
  excel_sample_file_id      bigint not null,
  excel_sample_file_size    bigint,
  excel_sample_file_name    varchar(255) not null,
  excel_sample_file_storage_path varchar(255) not null,
  excel_sample_file_type    integer,
  constraint ck_excel_sample_file_excel_sample_file_type check (excel_sample_file_type in (0,1)),
  constraint pk_excel_sample_file primary key (excel_sample_file_id))
;

create table institution (
  institution_id            bigint not null,
  institution_name          varchar(255),
  institution_abbreviation  varchar(255),
  institution_website_url   varchar(255),
  institution_logo_path     varchar(255),
  institution_description   TEXT,
  institution_known_for     varchar(255),
  nearest_town              varchar(255),
  institution_chancellor    varchar(255),
  institution_vc            varchar(255),
  institution_email         varchar(255),
  institution_tel           varchar(255),
  institution_phone         varchar(255),
  institution_address       varchar(255),
  institution_ranking_local integer,
  institution_ranking_africa integer,
  institution_ranking_global integer,
  institution_motto         varchar(255),
  institution_map_embed_url TEXT,
  region                    integer,
  institution_category_institution_category_id bigint,
  county_county_id          bigint,
  constraint ck_institution_region check (region in (0,1,2,3,4,5,6,7)),
  constraint pk_institution primary key (institution_id))
;

create table institution_category (
  institution_category_id   bigint not null,
  institution_category_name varchar(255),
  institution_category_description varchar(255),
  constraint pk_institution_category primary key (institution_category_id))
;

create table institution_course (
  institution_course_id     bigint not null,
  course_department_name    varchar(255),
  institution_institution_id bigint,
  course_course_id          bigint,
  school_or_faculty_school_id bigint,
  constraint pk_institution_course primary key (institution_course_id))
;

create table institution_partnership (
  institution_partnership_id bigint not null,
  institution_partnership_description TEXT,
  institution_institution_id bigint,
  partner_partner_id        bigint,
  constraint pk_institution_partnership primary key (institution_partnership_id))
;

create table job_placement (
  job_placement_id          bigint not null,
  job_placement_name        varchar(255),
  job_placement_description TEXT,
  job_placement_blog_url    varchar(255),
  course_course_id          bigint,
  constraint pk_job_placement primary key (job_placement_id))
;

create table partner (
  partner_id                bigint not null,
  partner_name              varchar(255),
  partner_description       varchar(255),
  partner_website_url       varchar(255),
  constraint pk_partner primary key (partner_id))
;

create table question (
  question_id               bigint not null,
  question_subject          varchar(255),
  question_body             TEXT,
  question_date             timestamp,
  seen                      boolean default false ,
  resolved                  boolean default false ,
  admin_notes               TEXT,
  constraint pk_question primary key (question_id))
;

create table research_center (
  research_center_id        bigint not null,
  research_center_name      varchar(255),
  research_center_description TEXT,
  research_center_email     varchar(255),
  research_center_contact_person varchar(255),
  research_center_url       varchar(255),
  research_center_phone     varchar(255),
  research_center_known_for varchar(255),
  institution_institution_id bigint,
  constraint pk_research_center primary key (research_center_id))
;

create table school_or_faculty (
  school_id                 bigint not null,
  school_name               varchar(255),
  school_description        TEXT,
  institution_institution_id bigint,
  constraint pk_school_or_faculty primary key (school_id))
;

create table specialization (
  specialization_id         bigint not null,
  specialization_name       varchar(255),
  specialization_description TEXT,
  constraint pk_specialization primary key (specialization_id))
;

create table subscription_email (
  subscription_email_id     bigint not null,
  subscription_email        varchar(255),
  subscription_date         timestamp,
  constraint uq_subscription_email_subscripti unique (subscription_email),
  constraint pk_subscription_email primary key (subscription_email_id))
;

create sequence admin_user_seq;

create sequence campus_seq;

create sequence club_society_seq;

create sequence county_seq;

create sequence course_seq;

create sequence course_certification_seq;

create sequence course_field_seq;

create sequence course_institution_mode_of_study_seq;

create sequence course_level_seq;

create sequence course_specialization_seq;

create sequence examination_body_seq;

create sequence excel_sample_file_seq;

create sequence institution_seq;

create sequence institution_category_seq;

create sequence institution_course_seq;

create sequence institution_partnership_seq;

create sequence job_placement_seq;

create sequence partner_seq;

create sequence question_seq;

create sequence research_center_seq;

create sequence school_or_faculty_seq;

create sequence specialization_seq;

create sequence subscription_email_seq;

alter table campus add constraint fk_campus_institution_1 foreign key (institution_institution_id) references institution (institution_id);
create index ix_campus_institution_1 on campus (institution_institution_id);
alter table club_society add constraint fk_club_society_institution_2 foreign key (institution_institution_id) references institution (institution_id);
create index ix_club_society_institution_2 on club_society (institution_institution_id);
alter table course add constraint fk_course_courseLevel_3 foreign key (course_level_course_level_id) references course_level (course_level_id);
create index ix_course_courseLevel_3 on course (course_level_course_level_id);
alter table course add constraint fk_course_courseField_4 foreign key (course_field_course_field_id) references course_field (course_field_id);
create index ix_course_courseField_4 on course (course_field_course_field_id);
alter table course_certification add constraint fk_course_certification_certif_5 foreign key (certification_course_course_id) references course (course_id);
create index ix_course_certification_certif_5 on course_certification (certification_course_course_id);
alter table course_institution_mode_of_study add constraint fk_course_institution_mode_of__6 foreign key (institution_course_institution_course_id) references institution_course (institution_course_id);
create index ix_course_institution_mode_of__6 on course_institution_mode_of_study (institution_course_institution_course_id);
alter table course_specialization add constraint fk_course_specialization_speci_7 foreign key (specialization_specialization_id) references specialization (specialization_id);
create index ix_course_specialization_speci_7 on course_specialization (specialization_specialization_id);
alter table course_specialization add constraint fk_course_specialization_cours_8 foreign key (course_course_id) references course (course_id);
create index ix_course_specialization_cours_8 on course_specialization (course_course_id);
alter table examination_body add constraint fk_examination_body_institutio_9 foreign key (institution_course_institution_course_id) references institution_course (institution_course_id);
create index ix_examination_body_institutio_9 on examination_body (institution_course_institution_course_id);
alter table institution add constraint fk_institution_institutionCat_10 foreign key (institution_category_institution_category_id) references institution_category (institution_category_id);
create index ix_institution_institutionCat_10 on institution (institution_category_institution_category_id);
alter table institution add constraint fk_institution_county_11 foreign key (county_county_id) references county (county_id);
create index ix_institution_county_11 on institution (county_county_id);
alter table institution_course add constraint fk_institution_course_institu_12 foreign key (institution_institution_id) references institution (institution_id);
create index ix_institution_course_institu_12 on institution_course (institution_institution_id);
alter table institution_course add constraint fk_institution_course_course_13 foreign key (course_course_id) references course (course_id);
create index ix_institution_course_course_13 on institution_course (course_course_id);
alter table institution_course add constraint fk_institution_course_schoolO_14 foreign key (school_or_faculty_school_id) references school_or_faculty (school_id);
create index ix_institution_course_schoolO_14 on institution_course (school_or_faculty_school_id);
alter table institution_partnership add constraint fk_institution_partnership_in_15 foreign key (institution_institution_id) references institution (institution_id);
create index ix_institution_partnership_in_15 on institution_partnership (institution_institution_id);
alter table institution_partnership add constraint fk_institution_partnership_pa_16 foreign key (partner_partner_id) references partner (partner_id);
create index ix_institution_partnership_pa_16 on institution_partnership (partner_partner_id);
alter table job_placement add constraint fk_job_placement_course_17 foreign key (course_course_id) references course (course_id);
create index ix_job_placement_course_17 on job_placement (course_course_id);
alter table research_center add constraint fk_research_center_institutio_18 foreign key (institution_institution_id) references institution (institution_id);
create index ix_research_center_institutio_18 on research_center (institution_institution_id);
alter table school_or_faculty add constraint fk_school_or_faculty_institut_19 foreign key (institution_institution_id) references institution (institution_id);
create index ix_school_or_faculty_institut_19 on school_or_faculty (institution_institution_id);



# --- !Downs

drop table if exists admin_user cascade;

drop table if exists campus cascade;

drop table if exists club_society cascade;

drop table if exists county cascade;

drop table if exists course cascade;

drop table if exists course_certification cascade;

drop table if exists course_field cascade;

drop table if exists course_institution_mode_of_study cascade;

drop table if exists course_level cascade;

drop table if exists course_specialization cascade;

drop table if exists examination_body cascade;

drop table if exists excel_sample_file cascade;

drop table if exists institution cascade;

drop table if exists institution_category cascade;

drop table if exists institution_course cascade;

drop table if exists institution_partnership cascade;

drop table if exists job_placement cascade;

drop table if exists partner cascade;

drop table if exists question cascade;

drop table if exists research_center cascade;

drop table if exists school_or_faculty cascade;

drop table if exists specialization cascade;

drop table if exists subscription_email cascade;

drop sequence if exists admin_user_seq;

drop sequence if exists campus_seq;

drop sequence if exists club_society_seq;

drop sequence if exists county_seq;

drop sequence if exists course_seq;

drop sequence if exists course_certification_seq;

drop sequence if exists course_field_seq;

drop sequence if exists course_institution_mode_of_study_seq;

drop sequence if exists course_level_seq;

drop sequence if exists course_specialization_seq;

drop sequence if exists examination_body_seq;

drop sequence if exists excel_sample_file_seq;

drop sequence if exists institution_seq;

drop sequence if exists institution_category_seq;

drop sequence if exists institution_course_seq;

drop sequence if exists institution_partnership_seq;

drop sequence if exists job_placement_seq;

drop sequence if exists partner_seq;

drop sequence if exists question_seq;

drop sequence if exists research_center_seq;

drop sequence if exists school_or_faculty_seq;

drop sequence if exists specialization_seq;

drop sequence if exists subscription_email_seq;

