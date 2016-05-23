package org.yatech.jedis.collections;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import static org.yatech.jedis.collections.Utils.assertNotNull;

/**
 * <p>Created on 14/05/16
 *
 * @author Yinon Avraham
 */
public class JedisCollections {

    private final JedisPool jedisPool;

    public JedisCollections(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
        assertNotNull(jedisPool, "jedisPool");
    }

    public static JedisMap getMap(Jedis jedis, String key) {
        return new JedisMap(jedis, key);
    }

    public JedisMap getMap(int db, String key) {
        return new JedisMap(jedisPool, db, key);
    }

    public static JedisList getList(Jedis jedis, String key) {
        return new JedisList(jedis, key);
    }

    public JedisList getList(int db, String key) {
        return new JedisList(jedisPool, db, key);
    }

    public static JedisSet getSet(Jedis jedis, String key) {
        return new JedisSet(jedis, key);
    }

    public JedisSet getSet(int db, String key) {
        return new JedisSet(jedisPool, db, key);
    }
}