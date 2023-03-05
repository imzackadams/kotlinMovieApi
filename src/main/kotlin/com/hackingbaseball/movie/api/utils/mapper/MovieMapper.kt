package com.hackingbaseball.movie.api.utils.mapper

import com.hackingbaseball.movie.api.dto.MovieDTO
import com.hackingbaseball.movie.api.entity.Movie

class MovieMapper: Mapper<MovieDTO, Movie> {

    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
            entity.id,
            entity.name,
            entity.rating
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
        )
    }


