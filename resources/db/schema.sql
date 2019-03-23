CREATE TABLE public.run_record
(
    id uuid NOT NULL,
    distance numeric(4,2),
    duration bigint,
    route_id uuid,
    date date,
    time_of_day time without time zone,
    temperature integer,
    weather text COLLATE pg_catalog."default",
    notes text COLLATE pg_catalog."default",
    CONSTRAINT run_record_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.run_record
    OWNER to krecktenwald;

CREATE TABLE public.run_route
(
    id uuid NOT NULL,
    name text COLLATE pg_catalog."default",
    distance numeric(4,2),
    average_pace bigint,
    CONSTRAINT run_route_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.run_route
    OWNER to krecktenwald;