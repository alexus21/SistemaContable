PGDMP     +                    {            db_catalogoDeCuentas    15.3    15.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                        0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            !           1262    196865    db_catalogoDeCuentas    DATABASE     �   CREATE DATABASE "db_catalogoDeCuentas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United Kingdom.1252';
 &   DROP DATABASE "db_catalogoDeCuentas";
                postgres    false            �            1259    196866    tbl_catalogoDeCuentas    TABLE     k   CREATE TABLE public."tbl_catalogoDeCuentas" (
    code text DEFAULT ''::text,
    account text NOT NULL
);
 +   DROP TABLE public."tbl_catalogoDeCuentas";
       public         heap    postgres    false            �            1259    196872    tbl_cuentasdeactivo    TABLE     c   CREATE TABLE public.tbl_cuentasdeactivo (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 '   DROP TABLE public.tbl_cuentasdeactivo;
       public         heap    postgres    false            �            1259    196877    tbl_cuentasdecierre    TABLE     c   CREATE TABLE public.tbl_cuentasdecierre (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 '   DROP TABLE public.tbl_cuentasdecierre;
       public         heap    postgres    false            �            1259    196882    tbl_cuentasdepasivo    TABLE     c   CREATE TABLE public.tbl_cuentasdepasivo (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 '   DROP TABLE public.tbl_cuentasdepasivo;
       public         heap    postgres    false            �            1259    196887    tbl_cuentasdepatrimonio    TABLE     g   CREATE TABLE public.tbl_cuentasdepatrimonio (
    codigo integer NOT NULL,
    nombre text NOT NULL
);
 +   DROP TABLE public.tbl_cuentasdepatrimonio;
       public         heap    postgres    false            �            1259    344266    tbl_dailyBook    TABLE     �   CREATE TABLE public."tbl_dailyBook" (
    fecha text,
    cuenta text NOT NULL,
    descripcion text,
    parcial text NOT NULL,
    debe text,
    haber text
);
 #   DROP TABLE public."tbl_dailyBook";
       public         heap    postgres    false            �            1259    311483    users    TABLE     o   CREATE TABLE public.users (
    id integer NOT NULL,
    username text NOT NULL,
    password text NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false                      0    196866    tbl_catalogoDeCuentas 
   TABLE DATA           @   COPY public."tbl_catalogoDeCuentas" (code, account) FROM stdin;
    public          postgres    false    214   �                 0    196872    tbl_cuentasdeactivo 
   TABLE DATA           =   COPY public.tbl_cuentasdeactivo (codigo, nombre) FROM stdin;
    public          postgres    false    215   �                  0    196877    tbl_cuentasdecierre 
   TABLE DATA           =   COPY public.tbl_cuentasdecierre (codigo, nombre) FROM stdin;
    public          postgres    false    216   >&                 0    196882    tbl_cuentasdepasivo 
   TABLE DATA           =   COPY public.tbl_cuentasdepasivo (codigo, nombre) FROM stdin;
    public          postgres    false    217   �&                 0    196887    tbl_cuentasdepatrimonio 
   TABLE DATA           A   COPY public.tbl_cuentasdepatrimonio (codigo, nombre) FROM stdin;
    public          postgres    false    218   c)                 0    344266    tbl_dailyBook 
   TABLE DATA           [   COPY public."tbl_dailyBook" (fecha, cuenta, descripcion, parcial, debe, haber) FROM stdin;
    public          postgres    false    220   *                 0    311483    users 
   TABLE DATA           7   COPY public.users (id, username, password) FROM stdin;
    public          postgres    false    219   P*       ~           2606    196893 ,   tbl_cuentasdeactivo tbl_cuentasDeActivo_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_cuentasdeactivo
    ADD CONSTRAINT "tbl_cuentasDeActivo_pkey" PRIMARY KEY (codigo);
 X   ALTER TABLE ONLY public.tbl_cuentasdeactivo DROP CONSTRAINT "tbl_cuentasDeActivo_pkey";
       public            postgres    false    215            �           2606    196895 1   tbl_cuentasdepatrimonio tbl_cuentasDeCapital_pkey 
   CONSTRAINT     u   ALTER TABLE ONLY public.tbl_cuentasdepatrimonio
    ADD CONSTRAINT "tbl_cuentasDeCapital_pkey" PRIMARY KEY (codigo);
 ]   ALTER TABLE ONLY public.tbl_cuentasdepatrimonio DROP CONSTRAINT "tbl_cuentasDeCapital_pkey";
       public            postgres    false    218            �           2606    196897 ,   tbl_cuentasdecierre tbl_cuentasDeCierre_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_cuentasdecierre
    ADD CONSTRAINT "tbl_cuentasDeCierre_pkey" PRIMARY KEY (codigo);
 X   ALTER TABLE ONLY public.tbl_cuentasdecierre DROP CONSTRAINT "tbl_cuentasDeCierre_pkey";
       public            postgres    false    216            �           2606    196899 ,   tbl_cuentasdepasivo tbl_cuentasDePasivo_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.tbl_cuentasdepasivo
    ADD CONSTRAINT "tbl_cuentasDePasivo_pkey" PRIMARY KEY (codigo);
 X   ALTER TABLE ONLY public.tbl_cuentasdepasivo DROP CONSTRAINT "tbl_cuentasDePasivo_pkey";
       public            postgres    false    217            �           2606    311489    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    219               :  x��Xͮ�4^g�� ��o�e���Ҧ7mG�+�,؀�x�#�b|��6�����ql�?���*�t3٫�y���~������g,^reލ�}�̧�^�3�d2��v�����&h'�Bh���ё�Tg�7~\�tn�=f����q�+ֽ�d�{���\�Z3��N�����/�W(�_M��͘�۾o,,"&(�|�
��B��-Ǫ<֙��O?
+��0w0ȳ`͒�#ɥ
�'��vd�;�`}�
nLԋ��r��$������:���i{�;;#N>�w��2;=�`ŧ����l7���j}�\tS�{��9����.d4z��v�����t�^1�jt����*��b���ק49'��@�_���3����@L���5�œ��fl<�!W߷>(�0=�e�9� a�u���������.w+�E��4�dk:�[�X��߈���yȡ�]Y(��y��	 Ԛ��S�!r'�G��Er,��b�nǆK7��;���35��8(��p�&\�'�ZF�1�������kZ�"�{=�+dD����,���w��0�\�ڱ�9ۉZ�(�JcZ�k���u�"�WV(�r��QS)Iim�½�,d.����g�Ku� VΞ,�e��9���G%[�8I(�#[K���V٪?0��j����0��;�OgBCy������N�}�*��JI�R	���"�#�E����z�I��ַ�����;eǧ����g��uƽ�b!pmg@��F����E��UT8��A�T8�^
>u�T��L#�y�/I�/!Yn5��B���!�����e�GvI`���Ȣd-"����k����������T�i��L���-�-x�,O�U��E�T_���:�X{u�r{�R��z��(�V�-��G�<�"��Q�!�}�O�
�L!�|ֱ�%i���ًNt�1sq���n,ᣉ	�̈́� �~���u���щN�/3�JD_��K-��g+]���BO�fC|o�����s�4v��9o��\���E�B��Ov��t׃"��	ԙ���	���}�dj��Z�� ����ڈ\m�IT*�D�h�3��[�l���@4O^��b$zE��j���qp�%N�}��'�l�a���J�O�vH{ZѠ/c�e)�GOp�Dɕ<�M�`�2Ye�h"���GII(T�f�����u [4D3.��㺓1��@�CM���	�-̷�dX�̠��H������H�Gl���Y�����֚���!6����(dZq��Nv�9C��C��3�N�Ur�Z���0z��%T
�?y�Z�l�T�@���a
�c��T�V���"�iB��)Dƣ��Ƣ��}�vRW�15�L�Jo؈����=e
o�	6�7����?��⺀���2B)�Y������F�d
���H�����g��>޸�߫���@D
�d�w�7u32�xQ�d�<�(8�)f�����wcsR!Q��ZT�&�e���jޮ��u�~�e���3�QvB��A�gp�Y����w�TGe#��r��|"8����L1X�:Pq��q�&?́-C��F���	|Y�'��9@�֠�e��II�Y½^�X���9�A)~�N˘ǤW됭�����6R+<k�<������j�SX�h3��b01(����g� AK�w������xi�|����뗁|���:I7�E��Q��z&���/wv����	���}���o���Ȭ��F�N��F��At����P������MVz�6�WԖ?<��e�&�k���O>�FnB�-���=����u��&���'�(�x�_��l*���?���ڱ��*�?M��~ι����.���#;kN�?w�/��?�� ��g���7�P?� 4��fp�騗yHF ���ZSg�5V�qb��&����򫒆U�C�\�[�G�Z��B��4���i��f-��Ґ�4���+>Ʌ�а�m��I-.��(��p>*��k�'Gvw�����RK���S�g(�r�gj�m7>��M��9����"�*��1O���&���|w8�x>�         a  x��WM��6^˧��Rπ��R٣�@� �̫lg�MR5���L�X��l<5;�j��앩w��^U�����������^ً�+�M�/��o���n+��W��h��2�U�]e����i�Ч�!���
1:7�e�]m����0]媶]��zmt��_eʵ7{Z��k���b��!,X��I):�q�˃6��+vf,������6����kL#t"d6�Y�+����$�
�h"�+�&B{�s-s��į�D{�BtH�GhwM�]����PM�U�+�Mc'��P����� k0G�B�55��iS��wl�	�~"ej����
Gc���d$���]��� iu�7�p�A�����1�{�+A霽αm����c�����+���zÖ1�둫�^Pt<�̓�B)�=']�
Dnih��KPT���8*��8���B�7�@���@!'*ڛ��#�n��%��uV�L]���9[���f'��_����MG��v���9����$�	T�Ѣ��}PM8;�(�+=5{��[�I0S�R���dF&(�x�eScW\/$Y� �rY�F/g�g�8�l�\���'�r6w~��Uܝ�;u�i�N 	��T~��ՙ��e]I�@Fcp���
Em(�����}H$̖J�\W,��~W\��P�b[�R��׃E�*C�攫\m�R���2�z��>���fV{jR* ޢU��L������c��HR �%,4�ل`"yqC�݂��`v�gL���&PUL��I��q4"�o		G�e���O��B���P���f���A�3�*~EE�\GL\+�Ra���������n� '�we�5�f<a��=)���e.�|Ҹ��%�tΠ����̃	��X(X��� �)���F�K�yl��쏊6������"�X|�v�@��G�FT�����D��T�Z�ˈ��l55��ygpa�l��	D�3W|�[����q���x���T�x�}H*į�̗q
�=�4`}�`|uR����7J�y��&��~<S�g��Om�k��锃�W�*�n���p��H
�b9����f(�X�d�!)9�E97 �;ѝǥ
*��Fp�I�
ơJ���»D-���֤@ .-"PP;r��1W�-�.=,!�E�4�M����x\Vܯxi��@�1 Њ�oK���M;���))8ʖD�l�>3:G���=ӗ[�� ���lKw�]O1/}d��y^���ᗞ�6:q���3��
V�`"�6�hq����d�P?}�|6���^�ћ��{�Ge�����iڦ�?^r��ҧ�}	˟�Xs�sn�ý��}��x�T#�g"fiS����n������         J   x�3�tu�qVpqUp�t
r�23��x�z�8��9�9\�\�"�
�
�~�~Ξ��z\1z\\\ ��*         �  x��T[�� �fN�	R��L�)��E��k7�[�H�X$�=��n6�_���Z���㩮��!t	i�T����r0�GكSL>�T5�1�r�A�0@���0(��o��ok��J|NH(�c��^M7L��(�# �Qyׅ�!�̀˶S n�R��7���{��i�O,;�4Y��`���.�n����ϑ�}���S�����H��G�����2�:����̛����|�:���c��X�ݡ<�M+̼,;��G���E�ޚv=:�
D	o�E�
��(����Ϝ��N��.�B��p�A�}+fP��$10LƁ]���n�EX ۩7L�"�����߄6����Cn�'~)��I��H�p��(a����p�������K����
�(r'*���s�J��h�Ճ6�RZ�[���ucq��'��%eױ��-���{��Y��ŵ�Rk����1����@�a���4w�6�3$CߓRƇ�ѓ6�S�=�ڊ�'��.ADM���U;Y(=Ղ���v�^9��vU*��Ӣ�k��wX�i&�o���Tɓ�p'`IK"E��N�Pc�J㲼�����1h}��ԏ5h�0�"��d�,��Q��x�����u��z`La5ӕZ�f��Z���r��-9/�_����7;�Bi�ϣ�)��4�]9��������HG��ђ5-�";M����z�/���/� �=         �   x�M�M�0F��)8���?kL��CC&����9L�غ�c�]F+<kb?�\�̆A��]��㎫n�����RCaSH
'��7FW�Ry!M(���Kei?
c���cሑ*2J�_�u3I��T^_�Z�H�6�:�� :/�����_�=K2�O����FB�         '   x��,O-*bNNSc#SNSS3S3s3N�=... ��            x�3�LL����H45-7(r����� F�w     