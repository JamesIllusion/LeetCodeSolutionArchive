# Write your MySQL query statement below
select E1.name
from Employee as E1, Employee as E2
where E1.ManagerId = E2.Id and E1.salary > E2.salary