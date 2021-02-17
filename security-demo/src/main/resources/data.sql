insert into new1_users (username, password, enabled)
    values ('user', 'user', true);

insert into new1_users (username, password, enabled)
    values ('admin', 'admin', true);

insert into new1_authorities (username, authority)
    values ('user', 'role_user');

insert into new1_authorities (username, authority)
    values ('admin', 'role_admin');