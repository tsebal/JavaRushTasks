-- Write your code here:
SELECT DISTINCT publisher.name
FROM publisher
         LEFT JOIN book ON publisher.id = book.publisher_id
         LEFT JOIN author ON author.id = book.author_id
WHERE author.full_name = 'Mark Twain';