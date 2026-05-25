-- Nivel 1: Departamentos (Son los padres)
INSERT INTO regiones (nombre, padre_id) VALUES ('Antioquia', NULL);
INSERT INTO regiones (nombre, padre_id) VALUES ('Cundinamarca', NULL);
INSERT INTO regiones (nombre, padre_id) VALUES ('Valle del Cauca', NULL);
INSERT INTO regiones (nombre, padre_id) VALUES ('Bolivar', NULL);

-- Nivel 2: Subregioens dentro de cada departamento
INSERT INTO regiones (nombre, padre_id) VALUES ('Area Metropolitana del Valle de Aburra', 1);
INSERT INTO regiones (nombre, padre_id) VALUES ('Sabana de Bogotá', 2);
INSERT INTO regiones (nombre, padre_id) VALUES ('Area Metropolitana de Cali', 3);
INSERT INTO regiones (nombre, padre_id) VALUES ('Canal del Dique', 4);

-- Nivel 3: Ciudaddes vinculadas a su region
INSERT INTO ciudades(nombre, pais, poblacion, region_id) VALUES ('Bogotá', 'Colombia', 8000000, 5);
INSERT INTO ciudades(nombre, pais, poblacion, region_id) VALUES ('Medellín', 'Colombia', 2500000, 6);
INSERT INTO ciudades(nombre, pais, poblacion, region_id) VALUES ('Cali', 'Colombia', 2200000, 7);
INSERT INTO ciudades(nombre, pais, poblacion, region_id) VALUES ('Cartagena', 'Colombia', 1000000, 8);