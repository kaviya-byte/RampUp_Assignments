DELIMITER //
CREATE FUNCTION GetProductFeature(brand varchar(100) )
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
DECLARE distinguishedFeature VARCHAR(20);
IF brand = 'benz' THEN
SET distinguishedFeature = 'Nice Design';
ELSEIF brand = 'audi' THEN
SET distinguishedFeature = 'super fast';
ELSEIF brand = 'lambo' THEN
SET distinguishedFeature = 'thunder speed ';
ELSEIF brand = 'rolerz' THEN
SET distinguishedFeature = 'expensive';
ELSEIF brand = 'bmw' THEN
SET distinguishedFeature = 'Good Performance';
END IF;
RETURN (distinguishedFeature);
END//
DELIMITER ;
