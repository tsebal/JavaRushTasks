-- Write your code here:
SELECT year_born AS author_country
FROM authors
WHERE year_born <= (SELECT MAX(date_released) FROM books)