#include "postgres.h"

PG_MODULE_MAGIC;

//void _PG_init(void);
//void _PG_fini(void);

int get_sum_impl(int a, int b);

PG_FUNCTION_INFO_V1(get_sum);
Datum get_sum(PG_FUNCTION_ARGS) {
    PG_RETURN_INT32(get_sum_impl(PG_GETARG_INT32(0), PG_GETARG_INT32(1));
}

