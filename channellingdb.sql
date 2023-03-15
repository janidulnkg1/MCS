-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3304
-- Generation Time: Sep 14, 2022 at 11:27 PM
-- Server version: 8.0.27
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `channellingdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE IF NOT EXISTS `appointment` (
  `AppointmentID` int NOT NULL AUTO_INCREMENT,
  `AppointmentNo` int NOT NULL,
  `AppointmentDate` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AppointmentTime` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pTitle` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pFname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pLname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pContactno` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pAge` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`AppointmentID`),
  UNIQUE KEY `AppointmentNo` (`AppointmentNo`)
) ENGINE=MyISAM AUTO_INCREMENT=5019 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`AppointmentID`, `AppointmentNo`, `AppointmentDate`, `AppointmentTime`, `pTitle`, `pFname`, `pLname`, `pContactno`, `pAge`, `dName`) VALUES
(5014, 1, '16-09-2022', '03:00 P.M', 'TXIu', 'SmFuaWR1', 'TGFua2FnZQ==', '+94703413223', 'MjM=', 'Vajira Gunawardhana'),
(5015, 2, '16-09-2022', '03:30 P.M', 'TXMu', 'VGhlamFuaQ==', 'R3VuYW5naQ==', '+94761325666', 'MTg=', 'Vajira Gunawardhana'),
(5017, 3, '16-09-2022', '04:00 P.M', 'TXIu', 'QWFkaWw=', 'RmFpemFs', '+94771857100', 'MTk=', 'Surangi Somaratna'),
(5018, 4, '16-09-2022', '04:15 P.M', 'TXIu', 'SmFtZXM=', 'TGFuZQ==', '+94762200954', 'MjM=', 'Vajira Gunawardhana');

-- --------------------------------------------------------

--
-- Table structure for table `doctordetails`
--

DROP TABLE IF EXISTS `doctordetails`;
CREATE TABLE IF NOT EXISTS `doctordetails` (
  `dID` int NOT NULL AUTO_INCREMENT,
  `dName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dSpeciality` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`dID`),
  UNIQUE KEY `dID` (`dID`)
) ENGINE=MyISAM AUTO_INCREMENT=2010 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `doctordetails`
--

INSERT INTO `doctordetails` (`dID`, `dName`, `dSpeciality`) VALUES
(2006, 'Vajira Gunawardhana', 'Cardiologist'),
(2007, 'Surangi Somaratna', 'Neurologist'),
(2008, 'Chandana Mohotti', 'Orthopedic Surgeon');

-- --------------------------------------------------------

--
-- Table structure for table `employeedetails`
--

DROP TABLE IF EXISTS `employeedetails`;
CREATE TABLE IF NOT EXISTS `employeedetails` (
  `eID` int NOT NULL AUTO_INCREMENT,
  `eName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`eID`),
  UNIQUE KEY `eID` (`eID`)
) ENGINE=MyISAM AUTO_INCREMENT=3007 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `employeedetails`
--

INSERT INTO `employeedetails` (`eID`, `eName`) VALUES
(3002, 'Sachith Kalhara'),
(3004, 'Ithira Gunawardhana'),
(3005, 'Ithira Gunawardhana'),
(3006, 'Ithira Gunawardhana');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

DROP TABLE IF EXISTS `userdetails`;
CREATE TABLE IF NOT EXISTS `userdetails` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `loginUsername` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `loginPassword` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userType` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `userID` (`userID`)
) ENGINE=MyISAM AUTO_INCREMENT=1019 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`userID`, `loginUsername`, `loginPassword`, `userType`) VALUES
(1001, 'SK', 'U0tATUNT', 'Receptionist'),
(1002, 'VG', 'VkdATUNT', 'Doctor'),
(1003, 'SS', 'U1NATUNT', 'Doctor'),
(1004, 'CM', 'Q01ATUNT', 'Doctor'),
(1018, 'IG', 'SUdATUNT', 'Receptionist');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
