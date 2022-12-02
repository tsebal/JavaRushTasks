-- Write your code here:
SELECT gym.location, person.location
FROM gyms AS gym,
     customers AS person
WHERE person.location NOT LIKE 'London'
GROUP BY gym.location, person.location