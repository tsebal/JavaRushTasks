-- Write your code here:
SELECT *
FROM films
         JOIN (SELECT year_born, id
               FROM film_directors
               WHERE film_directors.year_born < 1940) AS director
              ON films.director_id = director.id
WHERE films.genre LIKE 'sci-fi'