-- Write your code here:
SELECT released, COUNT(*) AS total
FROM lego_set
WHERE number < 10000
GROUP BY released
ORDER BY COUNT(*) DESC;