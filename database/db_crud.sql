-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18 Sep 2018 pada 04.51
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
  `poli` varchar(100) COLLATE utf8_bin NOT NULL,
  `dokter` varchar(100) COLLATE utf8_bin NOT NULL,
  `tglbook` varchar(100) COLLATE utf8_bin NOT NULL,
  `namadaftar` varchar(100) COLLATE utf8_bin NOT NULL,
  `norujuk` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data untuk tabel `tb_project`
--

INSERT INTO `tb_project` (`id`, `nomed`, `tgllhr`, `nama`, `alamat`, `nohp`, `bayar`, `poli`, `dokter`, `tglbook`, `namadaftar`, `norujuk`) VALUES
(1, 'wqgwgwqg', 'qwghqehbhw', 'rhwrhwrh', 'wrjhwrj', 'wrjrjwj', 'wrjwrjw', 'ghtrhw', 'etjetetj', 'etjetj', 'nenetne', 'neyjejet'),
(2, 'netjetje', 'etmyyja', 'srthjsrhaha', 'harthag', 'atrhatrh', 'atath', 'ath', 'at5j', 'aetj', 'aetj', 'aej5'),
(3, 'superman', 'clark', '2', 'avanger', 'ewegw', 'gwegwg', 'wgeewg', 'wgeweg', 'gwegw', 'gwegw', 'gggw'),
(4, 'hdhsh', 'jsjdjd', 'jsjssn', 'zjdjdn', 'xnnxxn', 'djndjd', 'jzsjs', 'nzdndn', 'nsnsns', 'nznznz', 'xmxmxzm'),
(5, 'asag', 'adgadgadg', 'adgadg', 'adgadg', 'gdga', 'gadgadg', 'adgadg', 'adgagd', 'adgadg', 'adgadg', 'adgadg'),
(6, 'asdas', 'dwqfqf', 'qeeqf', 'qeqegeqg', 'qegqe', 'gqegqeg', 'qedqb', 'sfbsbg', 'dgndgn', 'dgn', 'dgdfg'),
(7, '0000000001', '2018-9-17', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '082292345454', 'UMUM', 'BJ00 - AKUPUNTUR', 'Dr. Hj. Siti Mirza Nuriah, SpOg(K)', '2018-9-17', 'Muhammad Adam NH', '00000012345'),
(8, '0000000001', '2018-9-17', 'NANCY MARNITA AGRANI', 'JL TAMAN BUKIT RAFLESIA KM 7', '082292345454', 'UMUM', 'BJ00 - AKUPUNTUR', 'Dr. Hj. Siti Mirza Nuriah, SpOg(K)', '2018-9-17', 'Muhammad Adam NH', '00000012345'),
(9, '0000000002', '2018-9-17', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '087789876678', 'UMUM', 'BR00 - ANAK', 'Dr. Yunita Fediani, SpA,M.Kes', '2018-9-19', 'Adam NH', '000012345'),
(10, '00000000030', '2018-9-19', 'CILI HARLIANA', 'JL. PERINDUSTRIAN 2 SUKARAME KM 9 PALEMBANG', '087879142768', 'KERJASAMA', 'BG00 - GIGI DAN MULUT', 'Dr. Diah Melly Marlyana, SpOG(K)', '2018-9-13', 'julham', '0000112345668'),
(11, '0000000002', '1972-10-10', 'IDA SULASTRI', 'JL. KASWARI 2 NO. 202', '11111111', 'UMUM', 'BB05 - BEDAH ONKOLOGI', 'Drg. Else Gustiana, SpOrt', '2018-9-19', 'rawosi', '11111111');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
