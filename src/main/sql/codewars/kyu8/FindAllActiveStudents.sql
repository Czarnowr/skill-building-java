-- noinspection SqlResolveForFile
--
-- Create a simple SELECT query to display student information of all ACTIVE students.
--
-- students TABLE STRUCTURE:
--   Id
--   FirstName
--   LastName
--   IsActive
--
-- Note: IsActive (true or false)

-- Version 1 (SQLite):
SELECT Id,
       FirstName,
       LastName,
       IsActive
FROM students
WHERE IsActive = 1;

-- Version 2 (PostgradeSQL):
SELECT Id,
       FirstName,
       LastName,
       IsActive
FROM students
WHERE IsActive = true;