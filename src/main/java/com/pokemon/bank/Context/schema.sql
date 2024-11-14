CREATE TABLE tipo (
    nombre VARCHAR(20) PRIMARY KEY
);

CREATE TABLE pokemon (
    nombre VARCHAR(50) PRIMARY KEY,
    tipoP VARCHAR(20) NOT NULL,
    tipoS VARCHAR(20),
    FOREIGN KEY (tipoP) REFERENCES tipo(nombre),
    FOREIGN KEY (tipoS) REFERENCES tipo(nombre)
);

CREATE TABLE entrenador (
    nombre VARCHAR(50) PRIMARY KEY,
    sexo CHAR(1) CHECK (sexo IN ('M', 'F'))
);

CREATE TABLE bank (
    pokemon VARCHAR(50),
    entrenador VARCHAR(50),
    nivel INT CHECK (nivel > 0),
    PRIMARY KEY (pokemon, entrenador),
    FOREIGN KEY (pokemon) REFERENCES pokemon(nombre) ON DELETE CASCADE,
    FOREIGN KEY (entrenador) REFERENCES entrenador(nombre) ON DELETE CASCADE
);


INSERT INTO tipo (nombre) VALUES
('Normal'),
('Fuego'),
('Agua'),
('Eléctrico'),
('Planta'),
('Hielo'),
('Lucha'),
('Veneno'),
('Tierra'),
('Volador'),
('Psíquico'),
('Bicho'),
('Roca'),
('Fantasma'),
('Dragón'),
('Siniestro'),
('Acero'),
('Hada');

INSERT INTO pokemon (nombre, tipoP, tipoS) VALUES
('Bulbasaur', 'Planta', 'Veneno'),
('Ivysaur', 'Planta', 'Veneno'),
('Venusaur', 'Planta', 'Veneno'),
('Charmander', 'Fuego', NULL),
('Charmeleon', 'Fuego', NULL),
('Charizard', 'Fuego', 'Volador'),
('Squirtle', 'Agua', NULL),
('Wartortle', 'Agua', NULL),
('Blastoise', 'Agua', NULL),
('Caterpie', 'Bicho', NULL),
('Metapod', 'Bicho', NULL),
('Butterfree', 'Bicho', 'Volador'),
('Weedle', 'Bicho', 'Veneno'),
('Kakuna', 'Bicho', 'Veneno'),
('Beedrill', 'Bicho', 'Veneno'),
('Pidgey', 'Normal', 'Volador'),
('Pidgeotto', 'Normal', 'Volador'),
('Pidgeot', 'Normal', 'Volador'),
('Rattata', 'Normal', NULL),
('Raticate', 'Normal', NULL),
('Spearow', 'Normal', 'Volador'),
('Fearow', 'Normal', 'Volador'),
('Ekans', 'Veneno', NULL),
('Arbok', 'Veneno', NULL),
('Pikachu', 'Eléctrico', NULL),
('Raichu', 'Eléctrico', NULL),
('Sandshrew', 'Tierra', NULL),
('Sandslash', 'Tierra', NULL),
('Nidoran♀', 'Veneno', NULL),
('Nidorina', 'Veneno', NULL),
('Nidoqueen', 'Veneno', 'Tierra'),
('Nidoran♂', 'Veneno', NULL),
('Nidorino', 'Veneno', NULL),
('Nidoking', 'Veneno', 'Tierra'),
('Clefairy', 'Hada', NULL),
('Clefable', 'Hada', NULL),
('Vulpix', 'Fuego', NULL),
('Ninetales', 'Fuego', NULL),
('Jigglypuff', 'Normal', 'Hada'),
('Wigglytuff', 'Normal', 'Hada'),
('Zubat', 'Veneno', 'Volador'),
('Golbat', 'Veneno', 'Volador'),
('Oddish', 'Planta', 'Veneno'),
('Gloom', 'Planta', 'Veneno'),
('Vileplume', 'Planta', 'Veneno'),
('Paras', 'Bicho', 'Planta'),
('Parasect', 'Bicho', 'Planta'),
('Venonat', 'Bicho', 'Veneno'),
('Venomoth', 'Bicho', 'Veneno'),
('Diglett', 'Tierra', NULL),
('Dugtrio', 'Tierra', NULL),
('Meowth', 'Normal', NULL),
('Persian', 'Normal', NULL),
('Psyduck', 'Agua', NULL),
('Golduck', 'Agua', NULL),
('Mankey', 'Lucha', NULL),
('Primeape', 'Lucha', NULL),
('Poliwag', 'Agua', NULL),
('Poliwhirl', 'Agua', NULL),
('Poliwrath', 'Agua', 'Lucha'),
('Abra', 'Psíquico', NULL),
('Kadabra', 'Psíquico', NULL),
('Alakazam', 'Psíquico', NULL),
('Machop', 'Lucha', NULL),
('Machoke', 'Lucha', NULL),
('Machamp', 'Lucha', NULL),
('Bellsprout', 'Planta', 'Veneno'),
('Weepinbell', 'Planta', 'Veneno'),
('Victreebel', 'Planta', 'Veneno'),
('Tentacool', 'Agua', 'Veneno'),
('Tentacruel', 'Agua', 'Veneno'),
('Geodude', 'Roca', 'Tierra'),
('Graveler', 'Roca', 'Tierra'),
('Golem', 'Roca', 'Tierra'),
('Ponyta', 'Fuego', NULL),
('Rapidash', 'Fuego', 'Volador'),
('Magnemite', 'Eléctrico', 'Acero'),
('Magneton', 'Eléctrico', 'Acero'),
('Krabby', 'Agua', NULL),
('Kingler', 'Agua', NULL),
('Exeggcute', 'Planta', 'Psíquico'),
('Exeggutor', 'Planta', 'Psíquico'),
('Cubone', 'Tierra', NULL),
('Marowak', 'Tierra', NULL),
('Koffing', 'Veneno', NULL),
('Weezing', 'Veneno', NULL),
('Rhyhorn', 'Roca', 'Tierra'),
('Rhydon', 'Roca', 'Tierra'),
('Chansey', 'Normal', NULL),
('Blissey', 'Normal', NULL),
('Tangela', 'Planta', NULL),
('Kangaskhan', 'Normal', NULL),
('Horsea', 'Agua', NULL),
('Seadra', 'Agua', NULL),
('Staryu', 'Agua', NULL),
('Starmie', 'Agua', 'Psíquico'),
('Mr. Mime', 'Psíquico', 'Hada'),
('Scyther', 'Bicho', 'Volador'),
('Jynx', 'Hielo', 'Psíquico'),
('Electabuzz', 'Eléctrico', NULL),
('Magmar', 'Fuego', NULL),
('Pinsir', 'Bicho', NULL),
('Tauros', 'Normal', NULL),
('Magikarp', 'Agua', NULL),
('Gyarados', 'Agua', 'Volador'),
('Lapras', 'Agua', 'Hielo'),
('Ditto', 'Normal', NULL),
('Eevee', 'Normal', NULL),
('Vaporeon', 'Agua', NULL),
('Jolteon', 'Eléctrico', NULL),
('Flareon', 'Fuego', NULL),
('Espeon', 'Psíquico', NULL),
('Umbreon', 'Siniestro', NULL),
('Leafeon', 'Planta', NULL),
('Glaceon', 'Hielo', NULL),
('Sylveon', 'Hada', NULL);

INSERT INTO entrenador (nombre, sexo) VALUES
('Red', 'M'),        -- Pokémon Red/Blue (Kanto)
('Leaf', 'F'),       -- Pokémon FireRed/LeafGreen (Kanto)
('Ethan', 'M'),      -- Pokémon Gold/Silver (Johto)
('Lyla', 'F'),       -- Pokémon Gold/Silver (Johto)
('Brendan', 'M'),    -- Pokémon Ruby/Sapphire (Hoenn)
('May', 'F'),        -- Pokémon Ruby/Sapphire (Hoenn)
('Lucas', 'M'),      -- Pokémon Diamond/Pearl (Sinnoh)
('Dawn', 'F'),       -- Pokémon Diamond/Pearl (Sinnoh)
('Hilbert', 'M'),    -- Pokémon Black/White (Unova)
('Hilda', 'F'),      -- Pokémon Black/White (Unova)
('Calem', 'M'),      -- Pokémon X/Y (Kalos)
('Serena', 'F'),     -- Pokémon X/Y (Kalos)
('Chase', 'M'),      -- Pokémon Omega Ruby/Alpha Sapphire (Hoenn)
('Sapphire', 'F'),   -- Pokémon Omega Ruby/Alpha Sapphire (Hoenn)
('Elio', 'M'),       -- Pokémon Sun/Moon (Alola)
('Selene', 'F'),     -- Pokémon Sun/Moon (Alola)
('Victor', 'M'),     -- Pokémon Sword/Shield (Galar)
('Gloria', 'F'),     -- Pokémon Sword/Shield (Galar)
('Riley', 'M'),      -- Pokémon Legends: Arceus (Hisui)
('Akari', 'F');      -- Pokémon Legends: Arceus (Hisui)
