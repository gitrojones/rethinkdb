// Copyright 2010-2013 RethinkDB, all rights reserved.
#ifndef MEMCACHED_MEMCACHED_BTREE_APPEND_PREPEND_HPP_
#define MEMCACHED_MEMCACHED_BTREE_APPEND_PREPEND_HPP_

#include "btree/node.hpp"
#include "btree/slice.hpp"
#include "memcached/queries.hpp"

class superblock_t;

#if SLICE_ALT
append_prepend_result_t
memcached_append_prepend(const store_key_t &key, btree_slice_t *slice,
                         const counted_t<data_buffer_t>& data, bool append,
                         cas_t proposed_cas, exptime_t effective_time,
                         repli_timestamp_t timestamp, superblock_t *superblock);
#else
append_prepend_result_t
memcached_append_prepend(const store_key_t &key, btree_slice_t *slice,
                         const counted_t<data_buffer_t>& data, bool append,
                         cas_t proposed_cas, exptime_t effective_time,
                         repli_timestamp_t timestamp, transaction_t *txn, superblock_t *superblock);
#endif

#endif /* MEMCACHED_MEMCACHED_BTREE_APPEND_PREPEND_HPP_ */
