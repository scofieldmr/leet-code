# Write your MySQL query statement below

SELECT r.contest_id, 
       ROUND(Count(r.user_id)/(SELECT Count(*) FROM Users) * 100,2) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;