-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: universitesistemi
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `university_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `started_at` datetime NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `create_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,1,'me2hmet','2006-02-15 04:34:33','2006-02-15 04:34:33','2006-02-15 04:34:33','2006-02-15 04:34:33'),(2,1,'me23hmet','2006-02-15 04:34:33','2006-02-15 04:34:33','2006-02-15 04:34:33',NULL),(5,4,'west','2007-02-15 04:34:33','2007-02-15 04:34:33','2007-02-15 04:34:33',NULL),(8,10,'Abas','2007-02-15 04:34:33','2007-02-15 04:34:33','2007-02-15 04:34:33',NULL),(9,30,'mehmet','2009-02-15 04:34:33','2007-02-15 04:34:33','2007-02-15 04:34:33',NULL),(10,32,'mehmet','2009-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33',NULL),(11,22,'mehmet','2009-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33',NULL),(12,42,'mehmet','2009-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33',NULL),(13,43,'mehmet','2009-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33',NULL),(14,45,'mehmet','2009-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33',NULL),(15,46,'ali veli','2010-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33',NULL),(16,47,'ali veli','2010-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33',NULL),(17,50,'ali veli','2019-06-09 00:04:50','2019-06-09 00:04:50','2019-06-09 00:04:50',NULL),(18,51,'ali veli','2010-02-15 06:34:33','2019-06-09 00:06:06','2019-06-09 00:06:06',NULL),(19,52,'ali veli','2010-02-15 06:34:33','2019-06-09 01:25:04','2019-06-09 01:25:04',NULL),(20,53,'kazım','2010-02-15 06:34:33','2019-06-09 03:41:38','2019-06-09 03:41:38',NULL),(21,56,'kazım','2010-02-15 06:34:33','2019-06-09 21:30:02','2019-06-09 21:30:02',NULL),(22,57,'kazım','2010-02-15 06:34:33','2019-06-09 21:31:55','2019-06-09 21:31:55',NULL),(23,59,'kazım','2007-02-15 06:34:33','2019-06-09 23:28:10','2019-06-09 23:28:10',NULL);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `universities`
--

DROP TABLE IF EXISTS `universities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `universities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `api_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `web_page` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `founded_at` datetime NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `api_id` (`api_id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `universities`
--

LOCK TABLES `universities` WRITE;
/*!40000 ALTER TABLE `universities` DISABLE KEYS */;
INSERT INTO `universities` VALUES (1,1,'cbü','manisa','yok','yok','2006-02-15 04:34:33','2006-02-15 04:34:33','2006-02-15 04:34:33'),(7,4,'Adnan Menderes Üniversitesi','Aydın','adu.edu.tr','Devlet','0020-07-29 01:34:33','0020-07-29 01:34:33','0020-07-29 01:34:33'),(10,10,'Alanya Alaaddin Keykubat Üniversitesi','Antalya','alanyaaku.edu.tr','Devlet','0020-07-29 01:34:33','0020-07-29 01:34:33','0020-07-29 01:34:33'),(11,30,'Cumhuriyet Üniversitesi','Sivas','cumhuriyet.edu.tr','Devlet','0020-07-29 01:34:33','0020-07-29 01:34:33','0020-07-29 01:34:33'),(12,32,'Çankırı Karatekin Üniversitesi','Çankırı','karatekin.edu.tr','Devlet','0020-07-29 04:34:33','0020-07-29 04:34:33','0020-07-29 04:34:33'),(13,22,'Bayburt Üniversitesi','Bayburt','bayburt.edu.tr','Devlet','0020-07-29 04:34:33','0020-07-29 04:34:33','0020-07-29 04:34:33'),(14,42,'Eskişehir Osmangazi Üniversitesi','Eskişehir','ogu.edu.tr','Devlet','0020-07-29 04:34:33','0020-07-29 04:34:33','0020-07-29 04:34:33'),(15,43,'Fırat Üniversitesi','Elâzığ','firat.edu.tr','Devlet','2006-02-15 00:00:00','2006-02-15 00:00:00','2006-02-15 00:00:00'),(16,45,'Gazi Üniversitesi','Ankara','gazi.edu.tr','Devlet','2007-02-15 06:34:33','2006-02-15 00:00:00','2006-02-15 00:00:00'),(17,46,'Gaziantep Üniversitesi','Gaziantep','gantep.edu.tr','Devlet','2007-02-15 06:34:33','2007-02-15 06:34:33','2007-02-15 06:34:33'),(18,47,'Gaziosmanpaşa Üniversitesi','Tokat','gop.edu.tr','Devlet','1992-01-01 00:00:00','1992-01-01 00:00:00','1992-01-01 00:00:00'),(19,50,'Gümüşhane Üniversitesi','Gümüşhane','gumushane.edu.tr','Devlet','2008-01-01 00:00:00','2008-01-01 00:00:00','2008-01-01 00:00:00'),(20,51,'Hacettepe Üniversitesi','Ankara','hacettepe.edu.tr','Devlet','1957-01-01 00:00:00','1957-01-01 00:00:00','1957-01-01 00:00:00'),(22,52,'Hakkari Üniversitesi','Hakkari','hakkari.edu.tr','Devlet','2008-01-01 00:00:00','2008-01-01 00:00:00','2008-01-01 00:00:00'),(23,53,'Harran Üniversitesi','Şanlıurfa','harran.edu.tr','Devlet','1992-01-01 00:00:00','1992-01-01 00:00:00','1992-01-01 00:00:00'),(24,56,'Iğdır Üniversitesi','Iğdır','igdir.edu.tr','Devlet','2008-01-01 00:00:00','2008-01-01 00:00:00','2008-01-01 00:00:00'),(25,57,'İnönü Üniversitesi','Malatya','inonu.edu.tr','Devlet','1975-01-01 00:00:00','1975-01-01 00:00:00','1975-01-01 00:00:00'),(27,59,'İstanbul Medeniyet Üniversitesi','İstanbul','medeniyet.edu.tr','Devlet','2010-01-01 00:00:00','2010-01-01 00:00:00','2010-01-01 00:00:00');
/*!40000 ALTER TABLE `universities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'universitesistemi'
--

--
-- Dumping routines for database 'universitesistemi'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-09 23:37:14
