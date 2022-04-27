create or replace function ctmPassword() returns trigger as $$
	begin
	insert into customerPassword values(new.customerID, genPW());
	return null;
	end;
$$ language plpgsql;

create or replace function empPassword() returns trigger as $$
	begin
	insert into animatorPassword values(new.empID, genPW());
	return null;
	end;
$$ language plpgsql;

create or replace function genPW() returns text language sql as $$
SELECT substr(MD5(random()::text),0,17);
$$;

create or replace trigger addCustomerPassword
	after insert on customer
	for each row
	execute function ctmPassword();
	
create or replace trigger addAnimatorPassword
	after insert on animator
	for each row
	execute function empPassword();

insert into customer values('123456789', 'test', 43, 2,'5071132150')
insert into customerPassword values('123456789',genPW());

select * from customerPassword;
select * from customer;

delete from customerPassword;
delete from customer;

insert into animator values('234567899','test2', '5071132150','test area');

select * from animatorPassword;
select * from animator;

delete from animatorPassword;
delete from animator;