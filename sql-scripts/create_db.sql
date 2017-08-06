CREATE SCHEMA IF NOT EXISTS `courses_accounting` DEFAULT CHARACTER SET utf8;

use `courses_accounting`;

CREATE TABLE `directions_of_courses` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `direction` VARCHAR(200) NOT NULL
);

CREATE TABLE `notiffications` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `notice_datetime` DATETIME NOT NULL,
    `message` TEXT NOT NULL,
    `type` ENUM('E_MAIL', 'OPERATOR') NOT NULL,
    `status` ENUM('COMPLETE', 'WAITING', 'ERROR') NOT NULL
);

CREATE TABLE `users` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `first_name` VARCHAR(40) NOT NULL,
    `last_name` VARCHAR(40) NOT NULL,
    `birth_date` DATETIME NULL,
    `phone_number` INT(20) NOT NULL,
    `address` VARCHAR(40) NULL,
    `e-mail` VARCHAR(50) NOT NULL,
    `user_role` ENUM('STUDENT', 'TEACHER') NOT NULL,
    `id_notiffications` INT UNSIGNED NULL,
    FOREIGN KEY (`id_notiffications`)
        REFERENCES `notiffications` (`id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE
);

CREATE TABLE `cost_coefficients` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `coefficient` FLOAT UNSIGNED NOT NULL,
    `id_users` INT UNSIGNED NOT NULL,
    FOREIGN KEY (`id_users`)
        REFERENCES `users` (`id`)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);

CREATE TABLE `courses` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL,
    `cost` DOUBLE UNSIGNED NOT NULL,
    `duration_hours` FLOAT UNSIGNED NOT NULL,
    `id_directions_of_courses` INT UNSIGNED NOT NULL,
    FOREIGN KEY (`id_directions_of_courses`)
		REFERENCES `directions_of_courses` (`id`)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

CREATE TABLE `current_courses` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `start_date` DATE NULL,
    `end_date` DATE NULL,
    `id_courses` INT UNSIGNED NOT NULL,
    `id_cost_coefficients` INT UNSIGNED NULL,
    FOREIGN KEY (`id_courses`)
        REFERENCES `courses` (`id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE,
    FOREIGN KEY (`id_cost_coefficients`)
        REFERENCES `cost_coefficients` (`id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE
);

CREATE TABLE `users_current_courses` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `id_users` INT UNSIGNED NOT NULL,
    `id_current_courses` INT UNSIGNED NOT NULL,
    FOREIGN KEY (`id_users`)
        REFERENCES `users` (`id`)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (`id_current_courses`)
        REFERENCES `current_courses` (`id`)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

CREATE TABLE `lessons` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `sequence_number` SMALLINT UNSIGNED NOT NULL,
    `name` VARCHAR(300) NOT NULL,
    `id_courses` INT UNSIGNED NOT NULL,
    FOREIGN KEY (`id_courses`)
        REFERENCES `courses` (`id`)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

CREATE TABLE `complete_lessons` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `date` DATE NOT NULL,
    `id_current_courses` INT UNSIGNED NOT NULL,
    `id_lessons` INT UNSIGNED NOT NULL,
    FOREIGN KEY (`id_lessons`)
        REFERENCES `lessons` (`id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE,
    FOREIGN KEY (`id_current_courses`)
        REFERENCES `current_courses` (`id`)
        ON DELETE NO ACTION
        ON UPDATE CASCADE
);

CREATE TABLE `users_complete_lessons` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `id_users` INT UNSIGNED NOT NULL,
    `id_complete_lessons` INT UNSIGNED NOT NULL,
    FOREIGN KEY (`id_users`)
        REFERENCES `users` (`id`)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (`id_complete_lessons`)
        REFERENCES `complete_lessons` (`id`)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);