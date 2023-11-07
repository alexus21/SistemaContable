PGDMP      1            
    {            db_catalogoDeCuentas    16.0    16.0 1    ,           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            -           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            .           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            /           1262    24889    db_catalogoDeCuentas    DATABASE     �   CREATE DATABASE "db_catalogoDeCuentas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_El Salvador.1252';
 &   DROP DATABASE "db_catalogoDeCuentas";
                postgres    false            �            1259    24890    tbl_catalogodecuentas    TABLE     i   CREATE TABLE public.tbl_catalogodecuentas (
    code text DEFAULT ''::text,
    account text NOT NULL
);
 )   DROP TABLE public.tbl_catalogodecuentas;
       public         heap    postgres    false            �            1259    24896    tbl_cuentasdeactivo    TABLE     c   CREATE TABLE public.tbl_cuentasdeactivo (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 '   DROP TABLE public.tbl_cuentasdeactivo;
       public         heap    postgres    false            �            1259    24901    tbl_cuentasdecierre    TABLE     c   CREATE TABLE public.tbl_cuentasdecierre (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 '   DROP TABLE public.tbl_cuentasdecierre;
       public         heap    postgres    false            �            1259    24906    tbl_cuentasdepasivo    TABLE     c   CREATE TABLE public.tbl_cuentasdepasivo (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 '   DROP TABLE public.tbl_cuentasdepasivo;
       public         heap    postgres    false            �            1259    24911    tbl_cuentasdepatrimonio    TABLE     g   CREATE TABLE public.tbl_cuentasdepatrimonio (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 +   DROP TABLE public.tbl_cuentasdepatrimonio;
       public         heap    postgres    false            �            1259    24916    tbl_dailybook    TABLE     �   CREATE TABLE public.tbl_dailybook (
    cuenta text NOT NULL,
    codigo text NOT NULL,
    debe text,
    haber text,
    idpartida integer
);
 !   DROP TABLE public.tbl_dailybook;
       public         heap    postgres    false            �            1259    24921    tbl_libromayor    TABLE     �   CREATE TABLE public.tbl_libromayor (
    idlibro integer NOT NULL,
    codigo character varying(10) NOT NULL,
    cuenta character varying(100) NOT NULL,
    debe numeric(10,2),
    haber numeric(10,2)
);
 "   DROP TABLE public.tbl_libromayor;
       public         heap    postgres    false            �            1259    24924    tbl_libromayor_idlibro_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_libromayor_idlibro_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.tbl_libromayor_idlibro_seq;
       public          postgres    false    221            0           0    0    tbl_libromayor_idlibro_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.tbl_libromayor_idlibro_seq OWNED BY public.tbl_libromayor.idlibro;
          public          postgres    false    222            �            1259    24925    tbl_partida    TABLE     �   CREATE TABLE public.tbl_partida (
    idpartida integer NOT NULL,
    fecha character varying(50),
    descripcion character varying(50)
);
    DROP TABLE public.tbl_partida;
       public         heap    postgres    false            �            1259    24928    tbl_partida_idpartida_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_partida_idpartida_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.tbl_partida_idpartida_seq;
       public          postgres    false    223            1           0    0    tbl_partida_idpartida_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.tbl_partida_idpartida_seq OWNED BY public.tbl_partida.idpartida;
          public          postgres    false    224            �            1259    25106    tbl_registrousuarios    TABLE     �   CREATE TABLE public.tbl_registrousuarios (
    idregistro integer NOT NULL,
    usuario character varying(30) NOT NULL,
    fecha timestamp without time zone NOT NULL,
    actividad time without time zone NOT NULL
);
 (   DROP TABLE public.tbl_registrousuarios;
       public         heap    postgres    false            �            1259    25105 #   tbl_registrousuarios_idregistro_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_registrousuarios_idregistro_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 :   DROP SEQUENCE public.tbl_registrousuarios_idregistro_seq;
       public          postgres    false    228            2           0    0 #   tbl_registrousuarios_idregistro_seq    SEQUENCE OWNED BY     k   ALTER SEQUENCE public.tbl_registrousuarios_idregistro_seq OWNED BY public.tbl_registrousuarios.idregistro;
          public          postgres    false    227            �            1259    24929    users    TABLE     �   CREATE TABLE public.users (
    id integer NOT NULL,
    username text NOT NULL,
    password text NOT NULL,
    salt bytea NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    24934    users_id_seq    SEQUENCE     �   CREATE SEQUENCE public.users_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.users_id_seq;
       public          postgres    false    225            3           0    0    users_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.users_id_seq OWNED BY public.users.id;
          public          postgres    false    226            x           2604    24935    tbl_libromayor idlibro    DEFAULT     �   ALTER TABLE ONLY public.tbl_libromayor ALTER COLUMN idlibro SET DEFAULT nextval('public.tbl_libromayor_idlibro_seq'::regclass);
 E   ALTER TABLE public.tbl_libromayor ALTER COLUMN idlibro DROP DEFAULT;
       public          postgres    false    222    221            y           2604    24936    tbl_partida idpartida    DEFAULT     ~   ALTER TABLE ONLY public.tbl_partida ALTER COLUMN idpartida SET DEFAULT nextval('public.tbl_partida_idpartida_seq'::regclass);
 D   ALTER TABLE public.tbl_partida ALTER COLUMN idpartida DROP DEFAULT;
       public          postgres    false    224    223            {           2604    25109    tbl_registrousuarios idregistro    DEFAULT     �   ALTER TABLE ONLY public.tbl_registrousuarios ALTER COLUMN idregistro SET DEFAULT nextval('public.tbl_registrousuarios_idregistro_seq'::regclass);
 N   ALTER TABLE public.tbl_registrousuarios ALTER COLUMN idregistro DROP DEFAULT;
       public          postgres    false    227    228    228            z           2604    24937    users id    DEFAULT     d   ALTER TABLE ONLY public.users ALTER COLUMN id SET DEFAULT nextval('public.users_id_seq'::regclass);
 7   ALTER TABLE public.users ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    226    225                      0    24890    tbl_catalogodecuentas 
   TABLE DATA           >   COPY public.tbl_catalogodecuentas (code, account) FROM stdin;
    public          postgres    false    215   q7                 0    24896    tbl_cuentasdeactivo 
   TABLE DATA           =   COPY public.tbl_cuentasdeactivo (codigo, nombre) FROM stdin;
    public          postgres    false    216   �?                 0    24901    tbl_cuentasdecierre 
   TABLE DATA           =   COPY public.tbl_cuentasdecierre (codigo, nombre) FROM stdin;
    public          postgres    false    217   E                 0    24906    tbl_cuentasdepasivo 
   TABLE DATA           =   COPY public.tbl_cuentasdepasivo (codigo, nombre) FROM stdin;
    public          postgres    false    218   _E                  0    24911    tbl_cuentasdepatrimonio 
   TABLE DATA           A   COPY public.tbl_cuentasdepatrimonio (codigo, nombre) FROM stdin;
    public          postgres    false    219   *H       !          0    24916    tbl_dailybook 
   TABLE DATA           O   COPY public.tbl_dailybook (cuenta, codigo, debe, haber, idpartida) FROM stdin;
    public          postgres    false    220   �H       "          0    24921    tbl_libromayor 
   TABLE DATA           N   COPY public.tbl_libromayor (idlibro, codigo, cuenta, debe, haber) FROM stdin;
    public          postgres    false    221   1J       $          0    24925    tbl_partida 
   TABLE DATA           D   COPY public.tbl_partida (idpartida, fecha, descripcion) FROM stdin;
    public          postgres    false    223   rK       )          0    25106    tbl_registrousuarios 
   TABLE DATA           U   COPY public.tbl_registrousuarios (idregistro, usuario, fecha, actividad) FROM stdin;
    public          postgres    false    228   �K       &          0    24929    users 
   TABLE DATA           =   COPY public.users (id, username, password, salt) FROM stdin;
    public          postgres    false    225   �L       4           0    0    tbl_libromayor_idlibro_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.tbl_libromayor_idlibro_seq', 14, true);
          public          postgres    false    222            5           0    0    tbl_partida_idpartida_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.tbl_partida_idpartida_seq', 14, true);
          public          postgres    false    224            6           0    0 #   tbl_registrousuarios_idregistro_seq    SEQUENCE SET     Q   SELECT pg_catalog.setval('public.tbl_registrousuarios_idregistro_seq', 7, true);
          public          postgres    false    227            7           0    0    users_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.users_id_seq', 2, true);
          public          postgres    false    226            }           2606    24939 ,   tbl_cuentasdeactivo tbl_cuentasDeActivo_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_cuentasdeactivo
    ADD CONSTRAINT "tbl_cuentasDeActivo_pkey" PRIMARY KEY (codigo);
 X   ALTER TABLE ONLY public.tbl_cuentasdeactivo DROP CONSTRAINT "tbl_cuentasDeActivo_pkey";
       public            postgres    false    216            �           2606    24941 1   tbl_cuentasdepatrimonio tbl_cuentasDeCapital_pkey 
   CONSTRAINT     u   ALTER TABLE ONLY public.tbl_cuentasdepatrimonio
    ADD CONSTRAINT "tbl_cuentasDeCapital_pkey" PRIMARY KEY (codigo);
 ]   ALTER TABLE ONLY public.tbl_cuentasdepatrimonio DROP CONSTRAINT "tbl_cuentasDeCapital_pkey";
       public            postgres    false    219                       2606    24943 ,   tbl_cuentasdecierre tbl_cuentasDeCierre_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_cuentasdecierre
    ADD CONSTRAINT "tbl_cuentasDeCierre_pkey" PRIMARY KEY (codigo);
 X   ALTER TABLE ONLY public.tbl_cuentasdecierre DROP CONSTRAINT "tbl_cuentasDeCierre_pkey";
       public            postgres    false    217            �           2606    24945 ,   tbl_cuentasdepasivo tbl_cuentasDePasivo_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_cuentasdepasivo
    ADD CONSTRAINT "tbl_cuentasDePasivo_pkey" PRIMARY KEY (codigo);
 X   ALTER TABLE ONLY public.tbl_cuentasdepasivo DROP CONSTRAINT "tbl_cuentasDePasivo_pkey";
       public            postgres    false    218            �           2606    24947 "   tbl_libromayor tbl_libromayor_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.tbl_libromayor
    ADD CONSTRAINT tbl_libromayor_pkey PRIMARY KEY (idlibro);
 L   ALTER TABLE ONLY public.tbl_libromayor DROP CONSTRAINT tbl_libromayor_pkey;
       public            postgres    false    221            �           2606    24949    tbl_partida tbl_partida_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.tbl_partida
    ADD CONSTRAINT tbl_partida_pkey PRIMARY KEY (idpartida);
 F   ALTER TABLE ONLY public.tbl_partida DROP CONSTRAINT tbl_partida_pkey;
       public            postgres    false    223            �           2606    25111 ,   tbl_registrousuarios tbl_registrousuarios_pk 
   CONSTRAINT     r   ALTER TABLE ONLY public.tbl_registrousuarios
    ADD CONSTRAINT tbl_registrousuarios_pk PRIMARY KEY (idregistro);
 V   ALTER TABLE ONLY public.tbl_registrousuarios DROP CONSTRAINT tbl_registrousuarios_pk;
       public            postgres    false    228            �           2606    24951    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    225            �           2606    24952 *   tbl_dailybook tbl_dailybook_idpartida_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.tbl_dailybook
    ADD CONSTRAINT tbl_dailybook_idpartida_fkey FOREIGN KEY (idpartida) REFERENCES public.tbl_partida(idpartida);
 T   ALTER TABLE ONLY public.tbl_dailybook DROP CONSTRAINT tbl_dailybook_idpartida_fkey;
       public          postgres    false    220    4743    223                 x��XK���V���o�;Tٺ�jȖ[��2�A&	��F�,�7�CR����<�̢(���r��L�������������w,�re>��}�̯��ig��d���V����L�Nh��ڟm�#[�.zh��.��1z�Z�%�ӺWl{������۹Ruf���!Kg���e�Pv��0Y?�)����ZXDLP0����@�G�U�ԙ��?~V�;�a�a�g��%�g�K23Ͷ�-��F v6���ܙ�W��T�HD�/A��w�u����wqF�܀w��8=�`ŧ����l7����|�^tW�{��9����.d�z��v���F��u�^1�jt��o�*��b���ק49'��@�ߔ��3����AL���7�ŋ�tfj=�!7�w>(_0�g�9� a�u�^������.w+�UO�4�+dk:�;�X��߄���yȡ�]Y(��y�m	 Ԛ��S�!r'�G��Ur,��b�i��K7��;���35��8(�op�&\{'�ZF�)�������Gk:�!�=�+#dD����,���O��2�\�ڱ�9ۉZ�(�Jc^�k���u�"pTV(�r��QS)Iim��}�,d.����W�Ku� VΞ,�e��9���G%[�:I(�3[K���V٪�0��j����0��;�OoBKy�ƌ����^�}�*��JI�R	���.�#�E������I���������e�Kw�w��s�q��ͣ�s,.@�����t1�����"p��
�>�
�T��k�`A�����ʛ�i�"O�%���%#˭�vPH��D�5PҸ���.	̴��K�Y���EDQ�9�p�}��X7������"8�v^9"��G`�o�剺ꙺș꫾�W'먎R��^ʴC�bZ��
�E��h��[��4�7}��\��ɢ"��:v�D"m���8{Չ�f..�c�=�%|41Ἓp ՟>t���M�:�	c�u���:����v���b��TP��l��Cu�����N��3���󭱈T���!><�zP��7��:�ZrwA�>tl�L-��0@KP �`�}?T���5��B����c��cK�͖W�����XLD�����4���R񄶂-,�^�Q	�9�iO+�e�c,`�,e���	n�H ����l8B&��L@Ĝ�b�(	"	�����RR�. `��h�5²�l;��/�?�K�����|�K��H��{��|O��}�$:p�6�٩J�%�_l�Y:x�Tb�K�I~���B�E'���d��3t�0d�����r�$7�U � 9
��Q�[B� ����U,�IeN �*��;�PJ��E�*BQ�&tʙbAdlg0M��C���Y��qczWz�F$�(Sx�C����M�����TPF�J��Ȳ�l&$7&S�`-�]|�W�ϊ��W�tx�~���;�)/R����?���H��M����D��<���9d��7f(�0<�m�I�D��#jQa�x�Yk��y�����ǡ��5.z7��?���uY��!g1�W���P=����7��e����[��`c��@���[ĭ��4��IJ1{L��%�e�>���� �Z��	B&%�g� ���#��e/K��R�j��1�I�
�![���C��m�Vx��yD �����&��,�f0v�w�`bPI�^/dA���]���	+���<��h�v�ց����:K7�E���V ������H�BX!����]�U�z�U���%�k�+jw_�X�0��:�����'� M�U<�=�o��+y P=�6:?�c�@�����MtfW�;���a�����*�� ��5��
���3'��t�9�O��������Yă�Zx���_�S��3k<��fp���yHF ��/zfM3�n��I�ؓMړc���`�CIÇ��`nv��������������c@kj����?O򚆀�t��P�nk���R�.�B[	�2���&�zq�p'��{��c6�Pji�*b�b��l"Zy�u�~�&�n�̩���;�"���M�ѷ]�O���t:��1��         a  x��WM��6^˧��Rπ��R٣�@� �̫lg�MR5���L�X��l<5;�j��앩w��^U�����������^ً�+�M�/��o���n+��W��h��2�U�]e����i�Ч�!���
1:7�e�]m����0]媶]��zmt��_eʵ7{Z��k���b��!,X��I):�q�˃6��+vf,������6����kL#t"d6�Y�+����$�
�h"�+�&B{�s-s��į�D{�BtH�GhwM�]����PM�U�+�Mc'��P����� k0G�B�55��iS��wl�	�~"ej����
Gc���d$���]��� iu�7�p�A�����1�{�+A霽αm����c�����+���zÖ1�둫�^Pt<�̓�B)�=']�
Dnih��KPT���8*��8���B�7�@���@!'*ڛ��#�n��%��uV�L]���9[���f'��_����MG��v���9����$�	T�Ѣ��}PM8;�(�+=5{��[�I0S�R���dF&(�x�eScW\/$Y� �rY�F/g�g�8�l�\���'�r6w~��Uܝ�;u�i�N 	��T~��ՙ��e]I�@Fcp���
Em(�����}H$̖J�\W,��~W\��P�b[�R��׃E�*C�攫\m�R���2�z��>���fV{jR* ޢU��L������c��HR �%,4�ل`"yqC�݂��`v�gL���&PUL��I��q4"�o		G�e���O��B���P���f���A�3�*~EE�\GL\+�Ra���������n� '�we�5�f<a��=)���e.�|Ҹ��%�tΠ����̃	��X(X��� �)���F�K�yl��쏊6������"�X|�v�@��G�FT�����D��T�Z�ˈ��l55��ygpa�l��	D�3W|�[����q���x���T�x�}H*į�̗q
�=�4`}�`|uR����7J�y��&��~<S�g��Om�k��锃�W�*�n���p��H
�b9����f(�X�d�!)9�E97 �;ѝǥ
*��Fp�I�
ơJ���»D-���֤@ .-"PP;r��1W�-�.=,!�E�4�M����x\Vܯxi��@�1 Њ�oK���M;���))8ʖD�l�>3:G���=ӗ[�� ���lKw�]O1/}d��y^���ᗞ�6:q���3��
V�`"�6�hq����d�P?}�|6���^�ћ��{�Ge�����iڦ�?^r��ҧ�}	˟�Xs�sn�ý��}��x�T#�g"fiS����n������         J   x�3�tu�qVpqUp�t
r�23��x�z�8��9�9\�\�"�
�
�~�~Ξ��z\1z\\\ ��*         �  x��T[�� �fN�	R��L�)��E��k7�[�H�X$�=��n6�_���Z���㩮��!t	i�T����r0�GكSL>�T5�1�r�A�0@���0(��o��ok��J|NH(�c��^M7L��(�# �Qyׅ�!�̀˶S n�R��7���{��i�O,;�4Y��`���.�n����ϑ�}���S�����H��G�����2�:����̛����|�:���c��X�ݡ<�M+̼,;��G���E�ޚv=:�
D	o�E�
��(����Ϝ��N��.�B��p�A�}+fP��$10LƁ]���n�EX ۩7L�"�����߄6����Cn�'~)��I��H�p��(a����p�������K����
�(r'*���s�J��h�Ճ6�RZ�[���ucq��'��%eױ��-���{��Y��ŵ�Rk����1����@�a���4w�6�3$CߓRƇ�ѓ6�S�=�ڊ�'��.ADM���U;Y(=Ղ���v�^9��vU*��Ӣ�k��wX�i&�o���Tɓ�p'`IK"E��N�Pc�J㲼�����1h}��ԏ5h�0�"��d�,��Q��x�����u��z`La5ӕZ�f��Z���r��-9/�_����7;�Bi�ϣ�)��4�]9��������HG��ђ5-�";M����z�/���/� �=          �   x�M�M�0F��)8���?kL��CC&����9L�غ�c�]F+<kb?�\�̆A��]��㎫n�����RCaSH
'��7FW�Ry!M(���Kei?
c���cሑ*2J�_�u3I��T^_�Z�H�6�:�� :/�����_�=K2�O����FB�      !   A  x����n�0���S�	P��r�m��i�]LjJP԰$E���60!m���Ͽ�8^����Zc�S�5�(k��'�G�����:��=��S9�p�3R~�<����#L�(�%�0�5Db=`�x����{���[�f�cȩ�-A4ϱ�0��J�b���1e(4Ld�w�k8%���� RJj��N�P�E�a��k���Q+�Н�]�=C���\|5�)�#�d��,�v/XtƊN�<i���A�U��K�T��:)w�zw��?ٺ`@��s���������Xo�5�܈f:+i���������g�&��},���@m�      "   1  x�M��n�0�g�)�	t�v�6�֡Hѭ#3��J%%@߾�����P
��v)\QL4�r-%����hPJ*�a�'��,�6��t
��F1�ߋp�cQٴ�)*���4S`m�2mL6�b	<�<�����-|'7e+�"P������r�j�	�g�p�mpɋً3��,��/��l?	:Q�κ
�nү�s�/�$F|{�-�o!������~x��gG�jix�e�\��qX�����Ia��ğqf�a\�<�o���{�:Ё�:��\�d��zV"~�+�A�=L�M��C셀      $   |   x�34��*M-K-�Q00�Q��/�L�M*J�Q0202�tI,�/VHI-I��IL�/�24ī�1'=�������D.Cc����+���s��1Յ恬�.C��A�]Z�\�Y��yxsW� ��E�      )   �   x�u�=
A�zs�����NfrKk�����ҁW��#������ޞ�MH�`>�w��ֶ*���`ji�NY�+�)�F�K엶��FR�S�T��/�ɑ<P#�Ush+ZiȮ��C��w1�MZ\ >�lA�      &   �   x���n�@ ���4fvg�=� Fl"�BlY�4�*-"Яo������q@�'�������g�{�[o�&yqy|�r7���!X?����i�ZY���3���eI�X�����Ł��2��CjK���W<V?F�r2e�SW��p����Zs�����B�
XSD�a�YY�����E5�     