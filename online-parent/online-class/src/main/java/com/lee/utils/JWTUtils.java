package com.lee.utils;

import com.lee.domain.User;
import io.jsonwebtoken.*;

import java.util.Date;

/**
 *  JWT生成令牌、校验令牌
 *  1、生成的token 可以通过base64 解密出明文信息
 *  2、base64进行解密出明文信息，修改再进行编码，则会解密失败
 *  3、无法作废已颁布的token，除非改密钥
 */
public class JWTUtils {

    // token的过期时间 7天
    private static final long EXPIRE = 60000 * 60 * 24 * 7;
    // token的密钥
    private static final String SECRET = "limingheng";
    // token的前缀
    private static final String TOKEN_PREFIX = "xdclass";
    // token的主体
    private static final String SUBJECT = "xdclass";


    /***
     * 给用户生成token
     */
    public static String createToken(User user){
        String token = Jwts.builder()
                .setSubject(SUBJECT) // token的主体，主体里不要放用户的隐私信息，比如密码
                .claim("head_img", user.getHeadImg()) // 将用户的头像地址放进去
                .claim("id", user.getUserId()) // 将用户的id放进去
                .claim("username", user.getName()) // 将用户的名称放进去
                .setIssuedAt(new Date()) // 令牌的颁布时间
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE)) // 过期时间 = 当前时间 + EXPIRE
                .signWith(SignatureAlgorithm.HS256, SECRET) // 设置加密方式 + 我们定义的密钥
                .compact(); // 结束

        // token可以 加上 我们自己定义的签注
        return TOKEN_PREFIX+token;
    }

    /***
     * 校验令牌
     */
    public static Claims checkJWTToken(String token){
        try {
          final Claims body = Jwts.parser()
                    .setSigningKey(SECRET) // 将我们的密钥传递过去
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, "")) // 将前缀替换掉
                    .getBody();
          return body;
        } catch (ExpiredJwtException e) {
            e.printStackTrace();
        } catch (UnsupportedJwtException e) {
            e.printStackTrace();
        } catch (MalformedJwtException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }
}
