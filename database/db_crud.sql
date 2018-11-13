-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 05 Okt 2018 pada 12.39
-- Versi Server: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_crud`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_project`
--

CREATE TABLE `tb_project` (
  `id` int(11) NOT NULL,
  `nomed` varchar(100) COLLATE utf8_bin NOT NULL,
  `tgllhr` varchar(100) COLLATE utf8_bin NOT NULL,
  `nama` varchar(100) COLLATE utf8_bin NOT NULL,
  `alamat` varchar(100) COLLATE utf8_bin NOT NULL,
  `nohp` varchar(100) COLLATE utf8_bin NOT NULL,
  `bayar` varchar(100) COLLATE utf8_bin NOT NULL,
  `kerjasama` varchar(100) COLLATE utf8_bin NOT NULL,
  `poli` varchar(100) COLLATE utf8_bin NOT NULL,
  `dokter` varchar(100) COLLATE utf8_bin NOT NULL,
  `tglbook` varchar(100) COLLATE utf8_bin NOT NULL,
  `namadaftar` varchar(100) COLLATE utf8_bin NOT NULL,
  `norujuk` varchar(100) COLLATE utf8_bin NOT NULL,
  `tglnow` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data untuk tabel `tb_project`
--

INSERT INTO `tb_project` (`id`, `nomed`, `tgllhr`, `nama`, `alamat`, `nohp`, `bayar`, `kerjasama`, `poli`, `dokter`, `tglbook`, `namadaftar`, `norujuk`, `tglnow`) VALUES
(1, 'wqgwgwqg', 'qwghqehbhw', 'rhwrhwrh', 'wrjhwrj', 'wrjrjwj', 'wrjwrjw', '', 'ghtrhw', 'etjetetj', 'etjetj', 'nenetne', 'neyjejet', '0000-00-00 00:00:00'),
(2, 'netjetje', 'etmyyja', 'srthjsrhaha', 'harthag', 'atrhatrh', 'atath', '', 'ath', 'at5j', 'aetj', 'aetj', 'aej5', '0000-00-00 00:00:00'),
(3, 'superman', 'clark', '2', 'avanger', 'ewegw', 'gwegwg', '', 'wgeewg', 'wgeweg', 'gwegw', 'gwegw', 'gggw', '0000-00-00 00:00:00'),
(4, 'hdhsh', 'jsjdjd', 'jsjssn', 'zjdjdn', 'xnnxxn', 'djndjd', '', 'jzsjs', 'nzdndn', 'nsnsns', 'nznznz', 'xmxmxzm', '0000-00-00 00:00:00'),
(5, 'asag', 'adgadgadg', 'adgadg', 'adgadg', 'gdga', 'gadgadg', '', 'adgadg', 'adgagd', 'adgadg', 'adgadg', 'adgadg', '0000-00-00 00:00:00'),
(6, 'asdas', 'dwqfqf', 'qeeqf', 'qeqegeqg', 'qegqe', 'gqegqeg', '', 'qedqb', 'sfbsbg', 'dgndgn', 'dgn', 'dgdfg', '0000-00-00 00:00:00'),
(7, '0000000001', '2018-9-17', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '082292345454', 'UMUM', '', 'BJ00 - AKUPUNTUR', 'Dr. Hj. Siti Mirza Nuriah, SpOg(K)', '2018-9-17', 'Muhammad Adam NH', '00000012345', '0000-00-00 00:00:00'),
(8, '0000000001', '2018-9-17', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '082292345454', 'UMUM', '', 'BJ00 - AKUPUNTUR', 'Dr. Hj. Siti Mirza Nuriah, SpOg(K)', '2018-9-17', 'Muhammad Adam NH', '00000012345', '0000-00-00 00:00:00'),
(9, '0000000002', '2018-9-17', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '087789876678', 'UMUM', '', 'BR00 - ANAK', 'Dr. Yunita Fediani, SpA,M.Kes', '2018-9-19', 'Adam NH', '000012345', '0000-00-00 00:00:00'),
(10, '00000000030', '2018-9-19', 'CILI HARLIANA', 'JL. PERINDUSTRIAN 2 SUKARAME KM 9 PALEMBANG', '087879142768', 'KERJASAMA', '', 'BG00 - GIGI DAN MULUT', 'Dr. Diah Melly Marlyana, SpOG(K)', '2018-9-13', 'julham', '0000112345668', '0000-00-00 00:00:00'),
(11, '0000000002', '1972-10-10', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '11111111', 'UMUM', '', 'BB05 - BEDAH ONKOLOGI', 'Drg. Else Gustiana, SpOrt', '2018-9-19', 'rawosi', '11111111', '0000-00-00 00:00:00'),
(12, '0000000001', '2018-9-5', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '123', 'UMUM', '', 'CD00 - ANASTESI', 'Dr. Sonny H.A. Harsono,SpA', '2018-9-25', 'adam', '123', '2018-09-11 04:11:19'),
(13, '0000000002', '2018-9-29', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '089890098890', 'UMUM', '', 'BB01 - BEDAH ORTHOLOGI', 'Dr. H. Indrayadi SpA', '2018-9-30', 'akbar', '1234567890', 'Sep 29 2018 09:04:24'),
(14, '0000000002', '2018-9-29', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '089098098098', 'KERJASAMA', '', 'BJ00 - AKUPUNTUR', 'Dr. Diah Melly Marlyana, SpOG(K)', '2018-9-30', 'adam', '123123123', 'Sep 29 2018 10:53:17'),
(15, '0000000002', '2018-9-29', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '089089089089', 'UMUM', '', 'BB06 - BEDAH DIGESTIF', 'Dr. Erni Afriani, SpPD', '2018-9-30', 'adam', '1234567890', 'Sep 29 2018 10:58:10'),
(16, '0000000002', '2018-9-28', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '098098890098', 'UMUM', '', 'BJ00 - AKUPUNTUR', 'Dr. Sonny H.A. Harsono,SpA', '2018-10-1', 'julham', '123456789', 'Sep 30 2018 12:19:18'),
(17, '0000000003', '2018-9-30', 'YUNITA', 'JL. MACAN LINDUNGAN NO. 107 RT. 04 RW. 05', '0890890890890', 'UMUM', '', 'CD00 - ANASTESI', 'Dr. Yunita Fediani, SpA,M.Kes', '2018-10-1', 'Julham', '1234567890', 'Sep 30 2018 12:29:59'),
(18, '0000000003', '2018-7-2', 'YUNITA', 'JL. MACAN LINDUNGAN NO. 107 RT. 04 RW. 05', '089089098908', 'KERJASAMA', '', 'BB06 - BEDAH DIGESTIF', 'Dr. Alyssa Amelia Vania Utami', '2018-10-1', 'adam', '1234567890', 'Sep 30 2018 12:33:31'),
(19, '0000000003', '2018-7-2', 'YUNITA', 'JL. MACAN LINDUNGAN NO. 107 RT. 04 RW. 05', '089089098908', 'KERJASAMA', '', 'BB06 - BEDAH DIGESTIF', 'Dr. Alyssa Amelia Vania Utami', '2018-10-1', 'adam', '1234567890', 'Sep 30 2018 12:34:03'),
(20, '0000000009', '2018-10-1', 'GRACE ULTIA TRESNOSARI', 'JL. KARTOWINANGUN LR. KELUARGA RT 22 RW 08 NO.1029', '0797970966', 'UMUM', '', 'CD00 - ANASTESI', 'Dr. Erni Afriani, SpPD', '2018-9-30', 'Adam', '333444556', 'Sep 30 2018 01:12:44'),
(21, '00000000010', '2018-9-9', 'MIRA AMAZOLA', 'JL. KOL. SULAIMAN AMIN PERUM SRIWIJAYA RESIDENCE BLOK C NO. 09', '087898713141', 'UMUM', '', 'BJ00 - AKUPUNTUR', 'Dr. Yunita Fediani, SpA,M.Kes', '2018-10-1', 'Akbar Pambudi', '00091834', 'Sep 30 2018 01:25:39'),
(22, '00000000011', '2018-9-3', 'DESSY ALFIANI', 'JL. LUNJUK JAYA NO. 68 RT. 050 RW. 014 PALEMBANG', '09814714253156', 'KERJASAMA', '', 'BB04 - BEDAH SARAF', 'Dr. Alyssa Amelia Vania Utami', '2018-10-3', 'Yanda', '00091287', 'Sep 30 2018 01:31:49'),
(23, '00000000014', '2018-9-16', 'EVA NURIA', 'JL. PENDAWA LRG. MADUKARA NO.719', '09684762', 'KERJASAMA', '', 'BB03 - BEDAH PLASTIK', 'Dr. Erinnah Yunvina Permatasari', '2018-10-4', 'adafafa', '009795', 'Sep 30 2018 02:04:08'),
(24, '0000000002', '1994-9-30', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '082345543345', 'UMUM', '', 'BJ00 - AKUPUNTUR', 'Drg. Else Gustiana, SpOrt', '2018-10-1', 'adam halimi', '1234567890', 'Sep 30 2018 04:25:08'),
(25, '0000000001', '2018-9-18', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '098789879878', 'KERJASAMA', '', 'BB01 - BEDAH ORTHOLOGI', 'Dr. Diah Melly Marlyana, SpOG(K)', '2018-9-30', 'Adam Halimi', '1233131321321', 'Sep 30 2018 04:29:07'),
(26, '0000000001', '2018-9-18', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '098789879878', 'KERJASAMA', '', 'BB01 - BEDAH ORTHOLOGI', 'Dr. Diah Melly Marlyana, SpOG(K)', '2018-9-30', 'Adam Halimi', '1233131321321', 'Sep 30 2018 04:39:51'),
(27, '0000000001', '2018-9-5', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '141412', 'UMUM', '', 'BB06 - BEDAH DIGESTIF', 'Dr. Sonny H.A. Harsono,SpA', '2018-9-27', 'adada', 'adada', 'Sep 30 2018 04:47:38'),
(28, '0000000009', '1982-9-30', 'GRACE ULTIA TRESNOSARI', 'JL. KARTOWINANGUN LR. KELUARGA RT 22 RW 08 NO.1029', '080980980980', 'UMUM', '', 'BB00 - BEDAH UMUM', 'Dr. Alyssa Amelia Vania Utami', '2018-10-1', 'Tiara Rizki Wulansari', '12300087678987', 'Sep 30 2018 05:34:13'),
(29, '0000000005', '10-5-1974', 'MANISAH', 'GRIYA MITRA II BLOK J-01 JL. POLITEKNIK PALEMBANG', '081375338990', 'KERJASAMA', 'BPJS-JKN', 'BJ00 - AKUPUNTUR', 'Dr. H. Indrayadi SpA', '05-10-2018', 'Julham Ramadhana', '000123', 'Oct 03 2018 10:50:55'),
(30, '0000000005', '5-10-2018', 'MANISAH', 'GRIYA MITRA II BLOK J-01 JL. POLITEKNIK PALEMBANG', '085567765567', 'KERJASAMA', 'BPJS-JKN', 'BB06 - BEDAH DIGESTIF', 'Dr. Suprapti, SpPD', '06-10-2018', 'ADAM', '1123456789', 'Oct 05 2018 11:25:23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_project`
--
ALTER TABLE `tb_project`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_project`
--
ALTER TABLE `tb_project`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
