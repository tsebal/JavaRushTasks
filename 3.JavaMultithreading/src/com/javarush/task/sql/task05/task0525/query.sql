-- Write your code here:
SELECT full_name, COUNT(*) AS books
FROM book
         JOIN author ON author.id = book.author_id
GROUP BY full_name
HAVING books > 1;