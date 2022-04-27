create or replace procedure addIndActivity(actID char(9), actName varchar(35), actLink varchar(255),
										  actDate date, actHour time, actAge integer)
	language sql as $$
	insert into activity values(actID, actName, actLink, actDate, actHour);
	insert into individualActivity values(actId, actAge);
	$$;
	
create or replace procedure addMassAct(actID char(9), actName varchar(35), actLink varchar(255),
										  actDate date, actHour time, actType varchar(35), actCap integer)
	language sql as $$
	insert into activity values(actID, actName, actLink, actDate, actHour);
	insert into massActivity values(actID, actType, actCap);
	$$;