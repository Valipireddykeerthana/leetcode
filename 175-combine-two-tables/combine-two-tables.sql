# Write your MySQL query statement below
select
Person.firstName,
Person.lastName,
Address.City,
Address.state
from 
Person
left join Address
on
Person.PersonId=Address.PersonId;