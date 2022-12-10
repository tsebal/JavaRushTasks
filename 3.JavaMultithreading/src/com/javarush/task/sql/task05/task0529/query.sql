-- Write your code here:
SELECT author.full_name, COUNT(DISTINCT publisher.name) AS publishers
FROM author
         LEFT JOIN book ON author.id = book.author_id
         LEFT JOIN publisher ON publisher.id = book.publisher_id
GROUP BY author.full_name;