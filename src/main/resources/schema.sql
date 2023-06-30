create table BOOK
(
    id            int            not null,
    isbn          varchar(100)   not null,
    title         varchar(200)   not null,
    publisher     int            not null,
    yearpublished int            not null,
    price         decimal(18, 2) not null,
    category      varchar(100)   not null,
    quantity      int            not null,
    format        varchar(100)   not null,
    filesize      int            not null,
    PRIMARY KEY (id)
);

create table AUTHOR
(
    id   int          not null,
    name varchar(100) not null,
    primary key (id)
);