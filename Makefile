EXTENSION = spqr
MODULE_big = spqr
DATA = spqr--0.0.1.sql
OBJS = spqr.o 
PG_CONFIG = pg_config
PGXS := $(shell $(PG_CONFIG) --pgxs)
include $(PGXS)
