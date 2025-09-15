# Write your MySQL query statement below

Select customer_number from Orders
group by customer_number
ORDER BY COUNT(customer_number) DESC
limit 1;