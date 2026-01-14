-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2026 at 04:29 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasirbioskop`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `id_transaksi` int(11) DEFAULT NULL,
  `id_tiket` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detail_transaksi`
--

INSERT INTO `detail_transaksi` (`id_transaksi`, `id_tiket`) VALUES
(1, 0),
(1, 0),
(2, 0),
(2, 0),
(2, 0),
(3, 0),
(3, 0),
(4, 0),
(4, 0),
(5, 0),
(5, 0),
(6, 0),
(6, 0),
(7, 0),
(7, 0),
(8, 0),
(8, 0),
(9, 0),
(9, 0),
(10, 0),
(10, 0),
(10, 0),
(11, 0),
(11, 0),
(12, 0),
(12, 0),
(13, 0),
(13, 0),
(14, 0),
(14, 0),
(14, 0),
(15, 0),
(15, 0);

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `idFilm` int(11) NOT NULL,
  `judul` varchar(100) DEFAULT NULL,
  `genre` varchar(100) DEFAULT NULL,
  `durasi` int(11) DEFAULT 0,
  `rating` decimal(10,1) DEFAULT 0.0,
  `harga` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`idFilm`, `judul`, `genre`, `durasi`, `rating`, `harga`) VALUES
(1, 'tes', 'tes', 123, 4.0, 111),
(2, 'apa aja', 'comedy', 30, 4.0, 35000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `total_bayar` double DEFAULT NULL,
  `tanggal` varchar(50) DEFAULT NULL,
  `metode_pembayaran` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `total_bayar`, `tanggal`, `metode_pembayaran`) VALUES
(1, 90000, '2026-01-14', 'Cash'),
(2, 135000, '2026-01-14', 'Cash'),
(3, 90000, '2026-01-14', 'Cash'),
(4, 90000, '2026-01-14', 'Cash'),
(5, 120000, '2026-01-14', 'Cash'),
(6, 70000, '2026-01-14', 'Cash'),
(7, 70000, '2026-01-14', 'Cash'),
(8, 90000, '2026-01-14', 'Cash'),
(9, 90000, '2026-01-14', 'Cash'),
(10, 135000, '2026-01-14', 'Cash'),
(11, 105000, '2026-01-14', 'Cash'),
(12, 70000, '2026-01-14', 'Cash'),
(13, 90000, '2026-01-14', 'Cash'),
(14, 135000, '2026-01-14', 'Cash'),
(15, 70000, '2026-01-14', 'Cash');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`idFilm`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `film`
--
ALTER TABLE `film`
  MODIFY `idFilm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD CONSTRAINT `detail_transaksi_ibfk_1` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
