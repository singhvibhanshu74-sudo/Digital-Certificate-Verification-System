CREATE DATABASE digital_certificate_db;

USE digital_certificate_db;

CREATE TABLE certificates (
    certificate_id VARCHAR(50) PRIMARY KEY,
    holder_name VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL,
    issue_date DATE NOT NULL,
    expiry_date DATE NOT NULL,
    status VARCHAR(20) NOT NULL
);

INSERT INTO certificates
(certificate_id, holder_name, course, issue_date, expiry_date, status)
VALUES
('CERT001', 'Rahul', 'Computer Science', '2026-01-15', '2031-01-15', 'VALID'),
('CERT002', 'Aman', 'Information Technology', '2026-02-10', '2031-02-10', 'VALID');