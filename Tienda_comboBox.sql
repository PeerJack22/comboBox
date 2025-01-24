-- Crear la base de datos
CREATE DATABASE tienda;

-- Usar la base de datos
USE tienda;

-- Crear la tabla categorias
CREATE TABLE categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(100) NOT NULL
);

-- Insertar algunos datos
INSERT INTO categorias (nombre_categoria) VALUES ('Electrónica');
INSERT INTO categorias (nombre_categoria) VALUES ('Ropa');
INSERT INTO categorias (nombre_categoria) VALUES ('Alimentos');

Insert into categorias (nombre_categoria) values 
('Alimentos de mascotas'),
('Limpieza'),
('Juguetes');