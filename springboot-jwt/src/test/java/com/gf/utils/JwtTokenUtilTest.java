package com.gf.utils;

import io.jsonwebtoken.Claims;
import org.junit.Test;

public class JwtTokenUtilTest {


    private static final String tokenFromAlct56 = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjRDNTQwNzlDQTU4OUZDRUREMTg5NzYzRUZBQTU4MTUzNTQ5MUNCOEMiLCJ0eXAiOiJhdCtqd3QiLCJ4NXQiOiJURlFIbktXSl9PM1JpWFktLXFXQlUxU1J5NHcifQ.eyJuYmYiOjE2MDE5NTMxNTMsImV4cCI6MTYwMjAzOTU1MywiaXNzIjoiaHR0cDovL29hdXRoIiwiYXVkIjpbImRyaXZlciIsIm1haW50ZW5hbmNlIiwicG9ydGFsIiwidGF4IiwidHJhZGUiXSwiY2xpZW50X2lkIjoid2ViYXBpIiwic3ViIjoiNSIsImF1dGhfdGltZSI6MTYwMTk1MzE1MywiaWRwIjoibG9jYWwiLCJlY29kZSI6IkMwMDAwMDAwIiwiemNvZGUiOiIiLCJsb2dpbl9uYW1lIjoiYWRtaW4iLCJzY29wZSI6WyJkcml2ZXIiLCJtYWludGVuYW5jZSIsInBvcnRhbCIsInRheCIsInRyYWRlIl0sImFtciI6WyJlbnRlcnByaXNlX3VzZXIiXX0.XISw4ZCnubUfWLo_rWh-IkXqfUmJ7DzH1sCANxhiNNNgz3VnWjMPh9lXpgfY0U8GXQlOucXReay37fMHOGlDbJhx8XNyEFEpjjQldn_yeWbdvVRjGipiPPY2LIYOrRcU_XOrs9kfsp6sVheO8SgyJFVoKSIGGc3k_YYS39fh7agQpU4PdwT18CReKpNTFOTP0tSIO6SufrunBlG-_orbfqcAvXkFKHxEk9qpx1tnhZ_CrFxjOO9SzEtmpe_c9KtxdhgqGDNCZHgSkc9zYzHYrqVqBirbbpF_PzLDco5bS-giWsOeryod0pGIlFtshozxmts1CpacaOmu0vYSFtVVhfb1-34mZdARHDtHbTdo6s44Sn-Hc1Px4J3aNu50DGxEO7CO6AjUYhtF_IcD2Hq7qZ7vWrJaOfNf0-caqFMURJSIlcdtxfmW86JcDy2h8TbGn8KnnmqGZEpWBJHUCBBCAROtb8OrtyJG8NgNj97wzvu-OGt59DUtTGZiRQKMUVvL90z1fCUvfs6QYAfCNJIN_6H8xP9lxKANSh2qKcuA5CHKDlbkhW480CjhNhdXcponKNnXbRWexkzqU-pThMg8eHx4Gy-LZq36ikOSax_vSl_O1aVFT0nC9azZNY3P3o2RSXOJ269P_XGiAnTfRGO1XD_uqN2JyKsXKp3XfSbe6q8";

    private static final String token2 = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTYwMjM4ODYxM30.lGmxnyPNT5AYmB1_j3zmhPmCofyfuNGv28tFF1M2tVTUPMavvfMx3Zi_AosWATJ4bDS_Kpb0EgW_piBC2R9vPg";
    @Test
    public void getClaimsFromToken() {

        JwtTokenUtil tokenUtil = new JwtTokenUtil();
        Claims claimsFromToken = tokenUtil.getClaimsFromToken(token2);
        claimsFromToken.getSubject();
    }
}
