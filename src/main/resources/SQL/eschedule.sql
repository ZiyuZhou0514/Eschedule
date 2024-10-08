create table user(
                     phone_number VARCHAR(11) PRIMARY KEY NOT NULL ,
                     user_name VARCHAR(100) NOT NULL ,
                     authorization VARCHAR(50) NOT NULL ,
                     email VARCHAR(64),
                     birthday DATE,
                     firstLogin DATE,
                     picture VARCHAR(255)
);
CREATE TABLE timezones (
                           id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
                           name VARCHAR(64) NOT NULL
);

CREATE TABLE day_events (
                            id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
                            user_name INTEGER NOT NULL,
                            name VARCHAR(128) NOT NULL,
                            begin_date DATE NOT NULL,
                            end_date DATE NOT NULL,
                            repeated VARCHAR(24) NULL,
                            repetition_step INTEGER NULL,
                            repeated_monthly_on VARCHAR(24) NULL,
                            repeated_until VARCHAR(24) NULL,
                            repeated_until_date VARCHAR(24) NULL,
                            repeated_reps INTEGER NULL
);

CREATE TABLE time_events (
                             id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
                             user_id INTEGER NOT NULL,
                             start_timezone_id INTEGER NOT NULL,
                             end_timezone_id INTEGER NOT NULL,
                             name VARCHAR(128) NOT NULL,
                             begin_local_time DATETIME NOT NULL,
                             end_local_time DATETIME NOT NULL
);

CREATE TABLE day_slots (
                           id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
                           day_event_id INTEGER NOT NULL,
                           the_date DATE NOT NULL,
                           is_skipped TINYINT UNSIGNED NOT NULL DEFAULT 0
);

CREATE TABLE time_slots (
                            id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
                            time_event_id INTEGER NOT NULL,
                            begin_local_time DATETIME NOT NULL,
                            end_local_time DATETIME NOT NULL,
                            start_timezone_id INTEGER NOT NULL,
                            end_timezone_id INTEGER NOT NULL,
                            is_skipped TINYINT UNSIGNED NOT NULL DEFAULT 0
);

CREATE TABLE day_event_dows (
                                day_event_id INTEGER NOT NULL,
                                day_of_week VARCHAR(3) NOT NULL,
                                PRIMARY KEY (day_event_id, day_of_week),
                                KEY (day_of_week)
);

CREATE TABLE time_event_dows (
                                 time_event_id INTEGER NOT NULL,
                                 day_of_week VARCHAR(3) NOT NULL,
                                 PRIMARY KEY (time_event_id, day_of_week),
                                 KEY (day_of_week)
);

alter table user add column password varchar(64) not null ;
alter table user add column salt varchar(64) not null ;