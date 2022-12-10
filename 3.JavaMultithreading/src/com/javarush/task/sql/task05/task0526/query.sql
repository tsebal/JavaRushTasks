-- Write your code here:
SELECT book.title, book.publication_year, book.isbn, author.full_name AS author, publisher.name AS publisher
FROM book
        LEFT JOIN author ON author.id = book.author_id
        LEFT JOIN publisher ON publisher.id = book.publisher_id;