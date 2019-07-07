--create database ProjectPRJ_Quizlet-->
create database ProjectPRJ_Quizlet
Use ProjectPRJ_Quizlet
create table [User](
	[Username] varchar(30),
	[Password] varchar(32),
	[Email] varchar(30),
	[Name] varchar(30),
	primary key(Username)
)
--drop table [User] 
--alter table [User] drop column [ID]
--alter table [User] add [Name] varchar(30)
--insert into [User] values('luanpro','123','datnnhe130995@fpt.edu.vn','Nguyen Thanh Luan')
create table [Question](
	[QuestionID] int Identity(1,1) primary key,
	[Content] varchar(300),
	[AnswerContent_A] varchar(300),
	[AnswerContent_B] varchar(300),
	[AnswerContent_C] varchar(300),
	[AnswerContent_D] varchar(300),
	[CorrectAnswer] varchar(1),
	[QuestionSetID] varchar(20),
	Foreign Key (QuestionSetID) references QuestionSet(SetID)
)
drop table [QuestionSet]
drop table [Question]
insert into [Question](Content,AnswerContent_A,AnswerContent_B,AnswerContent_C,AnswerContent_D,CorrectAnswer,QuestionSetID) values()
create table [QuestionSet](
	[SetID] varchar(20),
	[SetName] varchar(20),
	[Creator] varchar(30),
	[Description] nvarchar(200)
	Primary key(SetID)
	Foreign key (Creator) references [User](Username)
)
insert into [QuestionSet] values('151915506NC','Networking Control'
/** incomplete
create table [UserLog](
	[UserID] varchar(20),
	[LogID] varchar(30),
)
**/