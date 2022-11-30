-- Write your code here:
SELECT CASE is_full_time
           WHEN 0 THEN 'false'
           WHEN 1 THEN 'true'
           END
FROM students