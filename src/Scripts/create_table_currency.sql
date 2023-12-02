-- Script pour créer la table Currency
CREATE TABLE IF NOT EXISTS Currency (
    currencyCode VARCHAR(3) PRIMARY KEY,
    currencyName VARCHAR(50) NOT NULL
);

