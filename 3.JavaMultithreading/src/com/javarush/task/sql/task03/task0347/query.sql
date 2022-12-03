-- Write your code here:
SELECT *
FROM film_directors
         RIGHT JOIN (SELECT title, director_id
                     FROM films
                     WHERE films.year_released > 1990) AS film
                    ON film_directors.id = film.director_id
WHERE film_directors.country LIKE 'USA'
LIMIT 5