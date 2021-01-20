USE baralter-db;

CREATE TABLE IF NOT EXISTS product
(
	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	price DECIMAL(6,2) NOT NULL,
	tax DECIMAL (2,2) NOT NULL

);



CREATE TABLE IF NOT EXISTS customer
(
	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	company_name varchar(255),
	street varchar(155),
	house_number varchar(4),
	flat_number int,
	post_code varchar(6),
	city varchar(155),
	nip varchar(10),
	payment ENUM ('RECEIPT', 'INVOICE') DEFAULT 'RECEIPT',


);

CREATE TABLE IF NOT EXISTS barorder
(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	customer_id INT NOT NULL,
	product_id INT NOT NULL,
	status ENUM ('OPENED', 'CLOSED') DEFAULT 'OPENED',
	quantity int NOT NULL,
	CONSTRAINT FK_customer_id FOREIGN KEY (customer_id) REFERENCES customer(id),
	CONSTRAINT FK_product_id FOREIGN KEY (product_id) REFERENCES product(id)

)
