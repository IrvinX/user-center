package irvin.uc.common.config;

//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author irvin
// * @date Create in 下午14:36 2017/9/11
// * @description Swagger config
// */
//@Deprecated
//@Configuration
//@ConfigurationProperties(prefix = "spring.redis")
//public class RedisSettings {
//
//	private int database;
//	private String host;
//	private int port;
//	private String password;
//	private int timeout;
//	private Pool pool;
//
//	public Pool getPool() {
//		return pool;
//	}
//
//	public void setPool(Pool pool) {
//		this.pool = pool;
//	}
//
//	public int getDatabase() {
//		return database;
//	}
//
//	public void setDatabase(int database) {
//		this.database = database;
//	}
//
//	public String getHost() {
//		return host;
//	}
//
//	public void setHost(String host) {
//		this.host = host;
//	}
//
//	public int getPort() {
//		return port;
//	}
//
//	public void setPort(int port) {
//		this.port = port;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public int getTimeout() {
//		return timeout;
//	}
//
//	public void setTimeout(int timeout) {
//		this.timeout = timeout;
//	}
//
//	public static class Pool {
//		private int maxActive;
//		private int maxWait;
//		private int maxIdle;
//		private int minIdle;
//
//		public int getMaxActive() {
//			return maxActive;
//		}
//
//		public void setMaxActive(int maxActive) {
//			this.maxActive = maxActive;
//		}
//
//		public int getMaxWait() {
//			return maxWait;
//		}
//
//		public void setMaxWait(int maxWait) {
//			this.maxWait = maxWait;
//		}
//
//		public int getMaxIdle() {
//			return maxIdle;
//		}
//
//		public void setMaxIdle(int maxIdle) {
//			this.maxIdle = maxIdle;
//		}
//
//		public int getMinIdle() {
//			return minIdle;
//		}
//
//		public void setMinIdle(int minIdle) {
//			this.minIdle = minIdle;
//		}
//	}
//}
