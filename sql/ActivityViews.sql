create or replace view massActivityInfo as
	select act.activityID, act.name, act.link, act.date, act.hour, activityType, capacity
	from activity act, massActivity mass
	where act.activityID = mass.activityID;
	
create or replace view indActivityInfo as
	select act.activityID, act.name, act.link, act.date, act.hour, age
	from activity act, individualActivity ind
	where act.activityID = ind.activityID