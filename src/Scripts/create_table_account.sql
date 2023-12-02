
-- Script pour créer la table Account
CREATE TABLE IF NOT EXISTS Account (
    accountId VARCHAR(50) PRIMARY KEY,
    balance DOUBLE PRECISION NOT NULL,
    currencyCode VARCHAR(3) REFERENCES Currency(currencyCode),
    CONSTRAINT positiveBalance CHECK (balance >= 0)
);
