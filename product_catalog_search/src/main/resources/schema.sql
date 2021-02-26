DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS product_brand;
DROP TABLE IF EXISTS product_color;
DROP TABLE IF EXISTS product_category;
  
CREATE TABLE product_brand (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

  
CREATE TABLE product_color (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  code VARCHAR(5) NOT NULL
);

  
CREATE TABLE product_category (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

  
CREATE TABLE product(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  quantity INT NOT NULL,
  size VARCHAR(5) NOT NULL,
  price INT NOT NULL,
  brand_id INT NOT NULL,
  foreign key (brand_id) references product_brand(id),
  color_id INT NOT NULL,
  foreign key (color_id) references product_color(id),
  category_id INT NOT NULL,
  foreign key (category_id) references product_category(id)
);