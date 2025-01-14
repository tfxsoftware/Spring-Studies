CREATE TABLE users (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    hashed_password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Add any indexes
CREATE INDEX idx_users_email ON users(email); 