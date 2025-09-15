# Write your MySQL query statement below

Select customer_number 
from Orders
group by customer_number 
Order BY Count(customer_number) desc 
limit 1;