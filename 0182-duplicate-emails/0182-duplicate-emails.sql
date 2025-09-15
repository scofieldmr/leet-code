# Write your MySQL query statement below

SELECT p.email from Person p
group by p.email
having count(*)>1;
