-- Write your code here:
SELECT isbn, title
FROM book
         JOIN author ON author.id = book.author_id
WHERE last_name LIKE 'S%';